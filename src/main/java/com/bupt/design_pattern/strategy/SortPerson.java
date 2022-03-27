package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 17:48
 * @description: Context,上下文环境类，负责提供对外的接口，与用户的交互，屏蔽上层对策略（算法）的直接访问。
 **/
public class SortPerson {

    ICompare compare;

    public SortPerson(ICompare compare) {
        this.compare = compare;
    }

    public void sort(Person[] list){
        int n = list.length;
        Person temp = null;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare.comparable(list[j], list[j + 1]) > 0){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

}
