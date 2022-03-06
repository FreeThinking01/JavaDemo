package com.bupt.design_pattern.singleton;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-15 23:03
 * @description: 双重校验 懒汉
 **/
public class Singleton1 {
    private static volatile Singleton1 instance;
    private Singleton1(){};
    public static Singleton1 getSingleton1(){
        if(instance == null){
            synchronized (Singleton1.class){
                if (instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
