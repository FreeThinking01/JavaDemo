package com.bupt.design_pattern.proxy.staticProxy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 16:20
 * @description: 代理类
 **/
public class DataServiceProxy implements DataService{

    DataServiceImpl dataService = new DataServiceImpl();

    @Override
    public void add() {
        dataService.add();
        System.out.println("add() 执行完毕，记录日志");
    }

    @Override
    public void delete() {
        dataService.delete();
        System.out.println("delete() 执行完毕，记录日志");
    }
}
