package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 17:43
 * @description: 具体策略：根据身高排序
 **/
public class CompareByHeight implements ICompare{
    @Override
    public int comparable(Person person1, Person person2) {
        return person1.height - person2.height;
    }
}
