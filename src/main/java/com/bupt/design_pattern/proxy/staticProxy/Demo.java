package com.bupt.design_pattern.proxy.staticProxy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 16:31
 * @description: 测试静态代理
 **/
public class Demo {
    public static void main(String[] args) {
        DataService dataService = new DataServiceProxy();
        dataService.add();
        dataService.delete();
    }
}
