package com.bupt.design_pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 18:22
 * @description: 方法1需要先获得class对象,使用Proxy.newProxyInstance()可以跳过这一步骤
 **/
public class ProxyInvocationHandler2 {
    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();
        DataService proxy = (DataService)getProxy(dataService);
        proxy.add();
        proxy.delete();
    }
    public static Object getProxy(Object target){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("delete")){
                    method.invoke(target, args);
                    System.out.println("delete执行了");
                }else{
                    method.invoke(target, args);
                }
                return null;
            }
        });
        return proxy;
    }
}
