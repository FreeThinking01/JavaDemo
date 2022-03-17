package com.bupt.datastructure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-17 17:46
 * @description: 无锁队列
 **/
//数组实现无锁队列,空出一个元素方便判断，当tail = head - 1队列满， tail = head队列空，head指向元素是空出的元素
class LockFreeQueue1 {

    private AtomicReferenceArray atomicReferenceArray;
    //代表为空，没有元素
    private static final Integer EMPTY = null;
    //头指针，尾指针
    AtomicInteger head,tail;

    public LockFreeQueue1(int size) {
        this.atomicReferenceArray = new AtomicReferenceArray<>(new Integer[size + 1]);
        this.head = new AtomicInteger(0);
        this.tail = new AtomicInteger(0);
    }

    //入队
    public boolean add(Integer element){
        //获取当前空的位置
        int index = (tail.get() + 1) % atomicReferenceArray.length();
        //判断队列已经满了
        if (index == head.get()){
            return false;
        }
        while (!atomicReferenceArray.compareAndSet(index, EMPTY, element)){
            return add(element);
        }
        tail.incrementAndGet();//移动尾指针
        return true;
    }

    //出队
    public Integer poll(){
        if (head.get() == tail.get()){
            return null;
        }
        int index = (head.get() + 1) % atomicReferenceArray.length();
        Integer e = (Integer) atomicReferenceArray.get(index);
        if(e.equals(null)){
            return poll();
        }
        while (!atomicReferenceArray.compareAndSet(index, e, null)){
            return poll();
        }
        head.incrementAndGet();
        return e;
    }

    public static void main(String[] args) {
        LockFreeQueue1 queue1 = new LockFreeQueue1(2);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.poll();
        queue1.poll();
        queue1.poll();
    }

}


class LockFreeQueue2 {//链表实现无锁队列

    private AtomicReferenceArray atomicReferenceArray;

}
