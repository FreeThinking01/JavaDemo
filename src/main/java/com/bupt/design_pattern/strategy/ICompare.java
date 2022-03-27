package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 17:40
 * @description: 策略抽象， 规定每个子类必须实现的方法
 **/
public interface ICompare {

    //person1 > person2 返回值>0，person1 == person2 返回0， person1 < person2 返回值小于0
    int comparable(Person person1, Person person2);

}
