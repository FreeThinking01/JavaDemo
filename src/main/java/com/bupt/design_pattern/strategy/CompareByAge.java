package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 17:42
 * @description: 具体策略：根据年龄排序
 **/
public class CompareByAge implements ICompare{
    @Override
    public int comparable(Person person1, Person person2) {
        return person1.age - person2.age;
    }
}
