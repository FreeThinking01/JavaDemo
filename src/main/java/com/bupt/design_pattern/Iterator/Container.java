package com.bupt.design_pattern.Iterator;

import java.util.HashMap;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2021-12-24 17:08
 * @description: 返回迭代器，所有集合需要实现
 **/
public interface Container {
    Iterator getIterator();
}
