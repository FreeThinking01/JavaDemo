package com.bupt.MultiThread.LockDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 10:33
 * @description: 线程池调用CountDownLatch
 **/
public class JoinCountDownLatch2 {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //将线程A添加到线程池
        executorService.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
            System.out.println("child threadOne over");
        });
        //将线程B添加到线程池
        executorService.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
            System.out.println("child threadTwo over");
        });
        System.out.println("waiting all thread over");
        //等待子线程执行完毕
        countDownLatch.await();
        System.out.println("all thread over");
        executorService.shutdown();
    }

}
