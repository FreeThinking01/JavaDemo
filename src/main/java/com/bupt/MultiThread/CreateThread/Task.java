package com.bupt.MultiThread.CreateThread;

import java.util.concurrent.*;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-18 21:53
 * @description: 实现Callable接口
 **/
public class Task implements Callable {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(100);
        return 2;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Task TaskDemo = new Task();
        Future<Integer> submit = executorService.submit(TaskDemo);
        System.out.println(submit.get());

    }
}
