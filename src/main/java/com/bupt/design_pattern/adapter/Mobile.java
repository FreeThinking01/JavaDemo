package com.bupt.design_pattern.adapter;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2021-12-24 21:42
 * @description: Mobile实体类，定义一个充电类
 **/
public class Mobile {

    public void inputPower(V5Power v5Power){
        int provideV5Power = v5Power.provideV5Power();
        System.out.println("需要5V电压，现在提供的：" + provideV5Power);
    }

    //实际应用为Arrays.asList(...T)将数组转变为List<>
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V220Power v220Power = new V220Power();
        V5Power v5Power = new V5PowerAdapter(v220Power);
        mobile.inputPower(v5Power);
    }
}
