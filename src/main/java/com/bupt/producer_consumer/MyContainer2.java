package com.bupt.producer_consumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JavaDemo
 * @author: liutangchen
 * @create: 2022-03-05 21:49
 * @description:
 **/
public class MyContainer2<T> {

    final private LinkedList<T> list = new LinkedList<>();
    private int count = 0;
    final private int MAX = 10;

    private Lock lock = new ReentrantLock();
    private Condition producer = lock.newCondition();
    private Condition consumer = lock.newCondition();

    public void set(T t){
        lock.lock();
        try {
            while (list.size() == MAX){
                producer.await();
            }
            count++;
            list.add(t);
            consumer.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public T get(){
        lock.lock();
        T t = null;
        try {
            while (list.size() == 0){
                consumer.await();
            }
            count--;
            t = list.removeFirst();
            producer.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return t;
    }


}
