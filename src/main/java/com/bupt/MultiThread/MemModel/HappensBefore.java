package com.bupt.MultiThread.MemModel;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-20 23:24
 * @description: 一个用于解释happens-before原则的demo
 **/
public class HappensBefore {

    boolean flag = false;
    int num = 1;
    int res = 0;

    /*
    * 线程1和线程2执行，没有执行加锁等同步策略
    * 分别执行的话不考虑重排序如果线程2的条件语句得到执行，那么res的值一定是9
    * 但是如果线程1进行了指令重排序,线程2在线程1的flag=true执行后num执行前会得到res = 1的结果
    * 所以对于多个线程操作同一变量，同时具有可见性和重排序的问题，重排序就是happens-before需要解决的问题
    * 多个线程会发生虽然在单个线程内没有数据依赖，但多个线程通过共享变量存在数据依赖导致单线程不能随便进行指令重排序的情况。
    * 单线程重排序as-if-serial解决，多线程重排序happens-before解决
    * */
    public void testMethod() throws Exception{

        Thread thread1 = new Thread(()->{
            //两个语句没有数据依赖，可以重排序
            num = 3;
            flag = true;
        });
        Thread thread2 = new Thread(()->{
            if (flag){
                res = num * num;
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(2000);//睡眠保证输出语句在两个线程执行完后执行
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception{
        HappensBefore demo = new HappensBefore();
        demo.testMethod();
    }
}
