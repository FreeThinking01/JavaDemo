package com.bupt.design_pattern.templateMethod;

import java.util.Date;
import java.util.logging.Logger;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-01-22 15:25
 * @description: 定义模板
 *
 * 模板方法模式：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * 模板方法三类角色：
 * 1. 具体方法
 * 2. 抽象方法
 * 3. 钩子方法
 *
 * 需求：本公司有程序猿、测试、HR、项目经理等人，下面使用模版方法模式，记录下所有人员的上班情况
 **/
public abstract class Worker {//定义工人超类
    //具体方法 所有工人的执行流程 定义为final不允许重写
    public final void workOneDay(){
        System.out.println("-----workday start-----");
        enterCompany();
        work();
        exitCompany();
        System.out.println("-----workday end-----");
    }

    //抽象方法 每个工种工作实现不同
    public abstract void work();

    //钩子方法 默认不需要打印时间
    public boolean isNeedPrintDate() {
        return false;
    }

    public void enterCompany() {
        System.out.println("worker has enter company");
    }

    private void exitCompany() {
        if(isNeedPrintDate()){
            System.out.println("离开时间："+ new Date().toString());
        }
        System.out.println("worker has exit company");
    }


}
