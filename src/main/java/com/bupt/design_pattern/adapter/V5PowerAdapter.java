package com.bupt.design_pattern.adapter;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2021-12-24 21:49
 * @description: V5充电适配器
 **/
public class V5PowerAdapter implements V5Power{

    private int power;

    public V5PowerAdapter(V220Power v220Power) {
        power = v220Power.providePower();
    }

    @Override
    public int provideV5Power() {
        System.out.println("经过转换操作，将"+power+"转换为"+"5V");
        return 5;
    }
}
