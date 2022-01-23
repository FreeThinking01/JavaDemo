package com.bupt.MultiThread.LockDemo;

import com.bupt.MultiThread.CreateThread.RunnableDemo;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-23 23:40
 * @description: 使用ReentrantLock来实现一个简单的线程安全的 list。
 **/
public class ReentrantLockDemo {

    public static class ReentrantLockList{

        //线程不安全的list
        private ArrayList<String> array = new ArrayList<String>();
        //独占锁
        private volatile ReentrantLock lock = new ReentrantLock();

        //添加元素
        public void add(String e){
            lock.lock();
            try{
                array.add(e);
            }finally {
                lock.unlock();
            }
        }

        //删除元素
        public void remove(String e){
            lock.lock();
            try{
                array.remove(e);
            }finally {
                lock.unlock();
            }
        }

        //获取数据
        public String get(int index){
            lock.lock();
            try{
                return array.get(index);
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockList list = new ReentrantLockList();
        list.add("hello");

    }
}
