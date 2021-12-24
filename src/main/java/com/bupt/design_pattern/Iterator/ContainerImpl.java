package com.bupt.design_pattern.Iterator;


import java.util.ArrayList;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2021-12-24 20:46
 * @description: 实现一个真正的容器
 **/
public class ContainerImpl<E> implements Container{

    //存放数据的底层数据，省略扩容等方法
    private Object[] names = new Object[10];
    int index = 0;

    //实现迭代器
    class IteratorImpl implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public E Next() {
            if(hasNext()){
                return (E)names[index++];
            }
            return null;
        }
    }

    //返回迭代器
    @Override
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    public void put(E element){
        names[index++] = element;
    }

    public static void main(String[] args) {
        ContainerImpl<String> test = new ContainerImpl<>();
        test.put("hello");
        Iterator iterator = test.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.Next());
        }
    }
}
