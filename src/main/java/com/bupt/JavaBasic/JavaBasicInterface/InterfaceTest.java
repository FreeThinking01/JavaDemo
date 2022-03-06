package com.bupt.JavaBasic.JavaBasicInterface;

/**
 * @program: JDK8
 * @author: FreeThinking
 * @create: 2021-12-21 18:01
 * @description: 接口测试
 **/
public interface InterfaceTest {
    public void printHello();
    //接口可以有实现方法
    default void printWorld(){
        System.out.println("world");
    }
    //接口中的字段都是static final的
    Integer num = 7;
}
