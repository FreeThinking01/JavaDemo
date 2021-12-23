package com.bupt.JavaBasic;

/**
 * @program: JDK8
 * @author: FreeThinking
 * @create: 2021-12-22 15:47
 * @description: 测试自动装箱和自动拆箱
 **/
public class IntegerTest {


    public static void main(String[] args) {
        //自动装箱和拆箱
//        int x = -1;
//        Integer y = 1;
//
//        //基本数据类型和包裹类型之间的赋值通过自动装箱和自动拆箱完成，以下为隐式调用
//
//        //装箱
//        Integer xInteger = Integer.valueOf(x);
//
//        //拆箱
//        int yInt = y.intValue();

        //超出默认常量池范围，两个不同的实例对象
        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);


    }

}
