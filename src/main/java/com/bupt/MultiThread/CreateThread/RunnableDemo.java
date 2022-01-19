package com.bupt.MultiThread.CreateThread;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-18 22:03
 * @description: 使用Runnable接口创建线程
 **/
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("使用Runnable");
    }

    public static void main(String[] args) {

        RunnableDemo RunDemo = new RunnableDemo();
        Thread demo = new Thread(RunDemo);
        demo.start();
    }
}
