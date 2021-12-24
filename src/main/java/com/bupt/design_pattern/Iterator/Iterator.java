package com.bupt.design_pattern.Iterator;

import java.util.HashMap;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2021-12-24 17:03
 * @description: 迭代器接口，所有集合都需要实现
 **/
public interface Iterator<E> {


    //是否有下一个元素
    boolean hasNext();

    //返回游标的下一个元素,返回的可以是泛型也可以是Object，注意使用泛型的好处
    E Next();

}
