package com.bupt.JavaBasic.JavaBasicInterface;



/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-25 10:54
 * @description: 接口实现
 **/
public class InterfaceTestImpl implements InterfaceTest{

    //子类会继承父类的static字段 但是是同一个引用对象


    @Override
    public void printHello() {
        System.out.println("test");
    }

    @Override
    public void printWorld() {
        InterfaceTest.super.printWorld();
    }
}
