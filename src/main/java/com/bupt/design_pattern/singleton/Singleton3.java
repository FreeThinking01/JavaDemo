package com.bupt.design_pattern.singleton;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-15 23:25
 * @description: 饿汉
 **/
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3(){};

    public static Singleton3 getInstance(){
        return instance;
    }

}
