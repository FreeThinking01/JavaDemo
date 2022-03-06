package com.bupt.MultiThread.LockDemo;

import java.util.concurrent.CountDownLatch;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 00:06
 * @description: CountDownLatch的Demo
 **/
public class JoinCountDownLatch {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
            System.out.println("threadOne over");
        });
        Thread threadTwo = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
            System.out.println("threadTwo over");
        });
        //启动子线程
        threadOne.start();
        threadTwo.start();
        System.out.println("waiting all thread over");
        //等待子线程执行完毕
        countDownLatch.await();
        System.out.println("all thread over");
    }

}
