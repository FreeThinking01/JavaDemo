package com.bupt.MultiThread.TransThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-19 18:46
 * @description: 测试线程状态转换
 **/
public class TransThreadDemo {

    class Thread1 implements Runnable {

        @Override
        public void run() {
            testMethod();
            System.out.println("thread1 was started");
        }
    }

    class Thread2 implements Runnable {

        @Override
        public void run() {
            testMethod();

            System.out.println("thread2 was started");
        }

    }

    //wait 和 notify方法必须在synchronized中使用，否则会报错， wait会释放锁
    //wait 和 notify 的线程在synchronized加锁对象中的monitor对象的等待队列中存储，等待获取锁在monitor对象的同步队列存储
    class TaskQueue {

        List<Integer> list = new ArrayList<>();

        public synchronized void addTask(Integer num) {
            list.add(num);
            this.notifyAll();
        }

        public synchronized Integer getTask() throws Exception {
            while (list.isEmpty()) {
                this.wait();
            }
            return list.get(list.size() - 1);
        }
    }

    public void testMain() throws Exception {
        //1.new thread1 只创建未启动， 处于new状态
        Thread thread1 = new Thread(new Thread1());
        //2.启动，进入runnable状态 thread1拿到锁进入运行态
        thread1.start();
        //3.thread1获取锁，thread2进入阻塞态
        Thread thread2 = new Thread(new Thread2());
        thread2.start();//阻塞态
        //4.线程1结束线程2拿到锁进入Runnable运行 线程1进入结束态 terminal

        /*
         * 下面新创建两个线程（线程3和线程4）说明Runnable和waiting转换 相应的创建类class thread3 thread4
         * */
        //5.线程3进入waiting状态 4种方式
        //5.1 wait() Java的所有锁都基于对象，wait方法是持有锁
        // 的线程通过锁的wait方法释放锁，进入wait状态等待唤醒
        //线程3获取数据，没获取到，进入waiting状态
        TaskQueue taskQueue = new TaskQueue();
        Thread thread3 = new Thread(() -> {
            try {
                Integer num = taskQueue.getTask();
                System.out.println("获取到数据：" + num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread3.start();
        //线程4放入数据，唤醒线程3
        Thread thread4 = new Thread(() -> {
            taskQueue.addTask(4);
        });
        thread4.start();

        //5.2 join() join()方法内部使用wait()方法，会释放锁
        Thread thread5 = new Thread(() -> {
            try {
                Thread.sleep(2000L);
                System.out.println("thread5执行");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        //使用sleep方法让线程5睡眠，此时执行线程6应该线程6先被执行，使用join会阻塞主线程直到线程5结束才执行线程6
        thread5.start();
        thread5.join();
        Thread thread6 = new Thread(() -> {
            System.out.println("thread6执行");
        });
        thread6.start();
        //5.3 sleep()不会释放锁，作用是使线程暂停执行

        //5.4 park()

//        向调度程序提示当前线程愿意放弃其当前对处理器的使用。调度程序可以随意忽略此提示。
//        Yield 是一种启发式尝试，旨在改善线程之间的相对进展，否则会过度使用 CPU。它的使用应与详细的分析和基准测试相结合，以确保它实际上具有预期的效果。
//        很少使用这种方法。它对于调试或测试目的可能很有用，它可能有助于重现由于竞争条件导致的错误。在设计并发控制结构（例如java.util.concurrent.locks包中的结构）时，它也可能很有用。
        Thread.yield();

    }

    public static void main(String[] args) throws Exception {

        TransThreadDemo demo = new TransThreadDemo();
        demo.testMain();

    }

    private synchronized void testMethod() {
        try {
            Thread.sleep(2000L);//进入waiting态，但不释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
