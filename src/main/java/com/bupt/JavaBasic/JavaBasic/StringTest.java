package com.bupt.JavaBasic;

/**
 * @program: JDK8
 * @author: FreeThinking
 * @create: 2021-12-10 16:25
 * @description: 验证常量池
 **/
public class StringTest {

    public static void main(String[] args) {
    /**
     *  String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1 == str2);//false
     */

    /**
     *  String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);//false
     */


    /**
     *  String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);//false
     */

    /**
        调用intern()方法时，如果存在堆中的对象，会直接保存对象的引用，而不会重新创建对象。
        String str1 = new String("ab") + new String("cd");
        str1.intern();
        String str2 = "abcd";
        System.out.println(str1 == str2);//true
    */


    /**
        String str1 = new String("ab") + new String("cd");
        str1.intern();
        String str2 = "abcd";
        System.out.println(str1 == str2);//true
        String str3 = new String("ab") + new String("cd");
        System.out.println(str1 == str3);//false
        str3.intern();
        String str4 = "abcd";
        System.out.println(str1 == str4);//true
        System.out.println(str3 == str4);//false
    */


    /**
     *  String str1 = "hello world";
        String str2 = "hello";
        String str3 = str2 + " world";
        System.out.println(str1 == str3);//false
     */


        String str1 = "hello world";
        final String str2 = "hello";
        String str3 = str2 + " world";
        System.out.println(str1 == str3);//true


    }
}
