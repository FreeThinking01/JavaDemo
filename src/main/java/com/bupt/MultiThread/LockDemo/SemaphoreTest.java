package com.bupt.MultiThread.LockDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 13:11
 * @description: Semphore实例
 **/
public class SemaphoreTest {

    //创建一个实例
    private static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //线程A添加到线程池
        executorService.submit(()->{
            System.out.println(Thread.currentThread() + "over");
            semaphore.release();
        });
        //线程B添加到线程池
        executorService.submit(()->{
            System.out.println(Thread.currentThread() + "over");
            semaphore.release();
        });
        //等待子线程执行完毕，返回
        semaphore.acquire(2);
        System.out.println("all thread over");
        //关闭线程池
        executorService.shutdown();
    }

}
