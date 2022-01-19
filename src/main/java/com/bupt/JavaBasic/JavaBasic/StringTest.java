package com.bupt.JavaBasic.JavaBasic;

/**
 * @program: JDK8
 * @author: FreeThinking
 * @create: 2021-12-10 16:25
 * @description: 验证常量池
 **/
public class StringTest {

    public static void main(String[] args) {

        /**
         * String是不可变的，底层是final char[] value
         * 被final修饰的数据不可变，对象不能指向其他地址，那么char[]不能改变地址，数据应该可以改变，为什么说不可变
         *
         * value不能引用别的对象，且string内部没有改变value的方法
         * */
        String str = new String("abc");


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

    /**
     *  String str1 = "hello world";
     *  final String str2 = "hello";
     *  String str3 = str2 + " world";
     *  System.out.println(str1 == str3);//true
     * */



        /**
         *
         *
         * */
        String s1 = new String("abc");// 堆内存的地址值
        String s2 = "abc";
        System.out.println(s1 == s2);// 输出 false,因为一个是堆内存，一个是常量池的内存，故两者是不同的。
        System.out.println(s1.equals(s2));// 输出 true


    }
}
