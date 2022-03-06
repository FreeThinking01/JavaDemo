package com.bupt.design_pattern.proxy.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import javax.xml.crypto.Data;
import java.lang.reflect.Method;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 18:59
 * @description: cglib实现不需要接口
 **/
public class ProxyInvocationHandler3 {
    public static void main(String[] args) {
        DataService target = new DataServiceImpl();
        DataService proxy = (DataService)getProxy(target);
        proxy.add();
        proxy.delete();
    }
    public static Object getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if(method.getName().equals("delete")){
                    method.invoke(target, objects);
                    System.out.println("delete执行了");
                }else{
                    method.invoke(target, objects);
                }
                return null;
            }
        });
        return enhancer.create();
    }
}


