package com.bupt.design_pattern.templateMethod;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-22 15:50
 * @description: 模板方法的实现
 **/
public class ITWorker extends Worker{
    @Override
    public void work() {
        System.out.println("ITWorker is working");
    }
    //重写钩子函数可以查看时间

    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

}
