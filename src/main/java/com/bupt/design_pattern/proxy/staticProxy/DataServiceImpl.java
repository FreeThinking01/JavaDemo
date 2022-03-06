package com.bupt.design_pattern.proxy.staticProxy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 16:13
 * @description: 实现类
 **/
public class DataServiceImpl implements DataService{
    @Override
    public void add() {
        System.out.println("正在执行add()方法");
    }

    @Override
    public void delete() {
        System.out.println("正在执行delete()方法");
    }
}
