package com.bupt.MultiThread.CreateThread;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-18 21:59
 * @description: 使用继承thread创建线程
 **/
public class ThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println("创建thread");
    }

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        demo.start();
    }
}
