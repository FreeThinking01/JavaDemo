package com.bupt.design_pattern.singleton;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-15 23:10
 * @description: 静态内部类 懒汉
 **/
public class Singleton2 {
    private Singleton2(){};
    private static class SingletonInstance{
        public static Singleton2 singleton2 = new Singleton2();
    }
    public static Singleton2 getSingleton(){
        return SingletonInstance.singleton2;
    }

}
