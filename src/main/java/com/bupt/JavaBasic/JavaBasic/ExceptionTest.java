package com.bupt.JavaBasic.JavaBasic;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-07 21:31
 * @description:
 **/
public class ExceptionTest {
    //1. error是否可以catch，是否可以throw
    public static void testCatch() throws Throwable {

    }

    public static void testCatch1() {
        try {

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            testCatch();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        testCatch1();
        System.out.println("test");
        FinalTest test = new FinalTest();
        Class<? extends FinalTest> aClass = test.getClass();
        aClass.getFields();
    }

    //2.
}
