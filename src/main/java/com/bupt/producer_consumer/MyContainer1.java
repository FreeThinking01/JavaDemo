package com.bupt.producer_consumer;

import sun.misc.Unsafe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: JavaDemo
 * @author: liutangchen
 * @create: 2022-03-05 17:42
 * @description:
 **/
public class MyContainer1<T> {


    public static void main(String[] args) {
        MyContainer1<String> blockQueue = new MyContainer1<>();



        Thread producer = new Thread(()->{

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("当前放入数据为：" + i);
                    blockQueue.put(String.valueOf(i));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(()->{

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("当前取出数据为：" + blockQueue.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();

        consumer.start();
    }

    //容器
    private final LinkedList<T> list = new LinkedList<>();

    private final int MAX = 10;
    private int count = 0;

    public synchronized void put(T t){
        while(list.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        list.add(t);
        // 注意此处为notifyAll而不是notify,因为notify是随机唤醒一个线程，很可能又是一个生产者，接着wait继续执行，检查while条件，如果成立，wait,程序不动了。
        this.notifyAll();
    }

    public synchronized T get(){
        T t = null;
        while (list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        count--;
        t = list.removeFirst();
        this.notifyAll();
        return t;
    }



}
