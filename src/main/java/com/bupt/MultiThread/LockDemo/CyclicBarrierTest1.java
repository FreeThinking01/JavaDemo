package com.bupt.MultiThread.LockDemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 11:15
 * @description: CyclicBarrierTest1
 **/
public class CyclicBarrierTest1 {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2,()->{
        System.out.println(Thread.currentThread() + "task1 merge result");
    });

    public static void main(String[] args) {
        //创建线程个数固定为2的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //将线程A添加到线程池
        executorService.submit(()->{
            try {
                System.out.println(Thread.currentThread() + "task1-1");
                System.out.println(Thread.currentThread() + "enter in barrier");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "enter out barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        //将线程B添加到线程池
        executorService.submit(()->{
            try {
                System.out.println(Thread.currentThread() + "task1-2");
                System.out.println(Thread.currentThread() + "enter in barrier");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread() + "enter out barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //关闭线程池
        executorService.shutdown();
    }
}
