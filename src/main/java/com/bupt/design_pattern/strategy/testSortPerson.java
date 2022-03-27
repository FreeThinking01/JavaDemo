package com.bupt.design_pattern.strategy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-27 18:01
 * @description:
 * 客户端，调用Context.
 * 客户端代码会选择具体策略并将其传递给上下文。客户端必须知晓策略之间的差异，才能做出正确的选择。
 **/
public class testSortPerson {



    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person("Tony", 2, 54, 82);
        persons[1] = new Person("Jack", 31, 74, 180);
        persons[2] = new Person("Eric", 23, 62, 178);
        persons[3] = new Person("Helen", 16, 45, 160);

        //客户端代码会选择具体策略并将其传递给上下文。客户端必须知晓策略之间的差异，才能做出正确的选择。
        CompareByAge compare = new CompareByAge();
        SortPerson sorter = new SortPerson(compare);
        sorter.sort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].age);
        }

    }

}
