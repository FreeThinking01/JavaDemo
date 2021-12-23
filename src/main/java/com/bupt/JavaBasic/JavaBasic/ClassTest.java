package com.bupt.JavaBasic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: JDK8
 * @author: FreeThinking
 * @create: 2021-12-14 16:20
 * @description: 测试关于类的概念
 **/
public class ClassTest {



    private int nums1 = 1;
    static int nums2 = 2;
    private int nums3 = 3;

    //成员内部类
    class InnerClassTest{
        private int nums3 = 1;
        public void InnerPrint(){
            System.out.println(nums1);//外部类private成员
            System.out.println(nums2);//外部类静态成员
            System.out.println(nums3);//覆盖掉外部类的同名变量
            System.out.println(ClassTest.this.nums3);
        }
    }

    //局部内部类测试
    ClassTest getDemo(){
        String str = "该字符串被编译时变成了final";
        class demo extends ClassTest{
            String hello = "hello";
            public void InPrint(){
                System.out.println(str);
            }
        }
        return new demo();
    }

    //匿名内部类
    //定义一个需要实现的接口
    interface animals{
        String getName();
    }

    //定义一个需要传入实现animals接口对象的方法
    void printAnimals(animals animal){
        System.out.println(animal.getName());
    }

    public static void main(String[] args) {
        //成员内部类
        ClassTest test1 = new ClassTest();
        ClassTest.InnerClassTest test2 = test1.new InnerClassTest();//必须通过外部类实例创建内部类
        test2.InnerPrint();

        //局部内部类
        ClassTest demo = test1.getDemo();

        //匿名内部类
        test1.printAnimals(new animals() {
            @Override
            public String getName() {
                return "tiger";
            }
        });

    }
}
