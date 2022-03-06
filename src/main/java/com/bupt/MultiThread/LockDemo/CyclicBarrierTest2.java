package com.bupt.MultiThread.LockDemo;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 11:28
 * @description:
 * 假设一个任务由阶段1、阶段2和阶段3组成，每个线程要串行地执行阶段1、阶段⒉和阶段3，
 * 当多个线程执行该任务时，必须要保证所有线程的阶段1全部完成后才能进入阶段2执行，当所
 * 有线程的阶段2全部完成后才能进入阶段3执行。下面使用CyclicBarrier 来完成这个需求。
 **/
public class CyclicBarrierTest2 {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        //创建线程个数固定为2的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //将线程A添加到线程池
        executorService.submit(()->{
            try {
                System.out.println(Thread.currentThread() + "step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "step3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        //将线程B添加到线程池
        executorService.submit(()->{
            try {
                System.out.println(Thread.currentThread() + "step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "step3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //关闭线程池
        executorService.shutdown();
    }
}
