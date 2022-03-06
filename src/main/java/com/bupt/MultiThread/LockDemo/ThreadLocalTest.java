package com.bupt.MultiThread.LockDemo;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-24 13:37
 * @description: threadlocal示例
 **/
public class ThreadLocalTest {

    //1. print函数
    static void print(String str){
        //1.1 打印当前线程本地内存中localVariable变量的值
        System.out.println(str + "：" + localVariable.get());
        //1.2 清除当前线程本地内存中的localVariable变量
        localVariable.remove();
    }
    //2. 创建threadLocal变量
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    public static void main(String[] args) {

        //3. 创建线程one
        Thread threadOne = new Thread(()->{
            //3.1 设置线程one中本地变量localVariable的值
            localVariable.set("threadOne local variable");
            //3.2 调用打印函数
            print("threadOne");
            //3.3 打印本地变量值
            System.out.println("threadOne remove after:"  + localVariable.get());
        });

        //4. 创建线程two
        Thread threadTwo = new Thread(()->{
            //4.1 设置线程one中本地变量localVariable的值
            localVariable.set("threadTwo local variable");
            //4.2 调用打印函数
            print("threadTwo");
            //4.3 打印本地变量值
            System.out.println("threadTwo remove after:"  + localVariable.get());
        });

        threadOne.start();
        threadTwo.start();
    }
}
