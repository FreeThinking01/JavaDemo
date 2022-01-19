package com.bupt.JavaBasic.JavaBasic;

import java.util.HashMap;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-11 17:09
 * @description: 测试final修饰的变量存放位置
 **/
public class FinalTest {
    //final修饰的对象存放在常量池还是堆中
    public final HashMap<Integer, Integer> finalMap = new HashMap<>();
    public HashMap<Integer, Integer> map = new HashMap<>();
}
