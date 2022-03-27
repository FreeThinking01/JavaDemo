package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 17:36
 * @description: bean类
 **/
public class Person {

    String name;
    int age;
    int weight;
    int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
