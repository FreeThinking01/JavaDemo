package com.bupt.design_pattern.templateMethod;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-22 15:54
 * @description: 测试方法
 **/
public class TestMethod {

    public static void main(String[] args) {
        Worker worker = new ITWorker();
        worker.workOneDay();
    }
}
