package com.bupt.datastructure;


//1. 循环数组实现 考虑并发可以加锁
class MyCircularQueue {

    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
        this.capacity = k;
    }

    public boolean enQueue(int value) {
        if(this.count == this.capacity){
            return false;
        }
        this.queue[(this.headIndex + this.count)% this.capacity]  = value;
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if(this.count == 0){
            return false;
        }
        this.headIndex = (this.headIndex + 1) %  capacity;
        this.count--;
        return true;
    }

    public int Front() {
        if(this.count == 0){
            return -1;
        }
        return queue[headIndex];
    }

    public int Rear() {
        if(this.count == 0){
            return -1;
        }
        return this.queue[(this.headIndex + this.count - 1) % this.capacity];
    }

    public boolean isEmpty() {
        return count == 0 ? true : false;
    }

    public boolean isFull() {
        return count == capacity ? true : false;
    }
}


