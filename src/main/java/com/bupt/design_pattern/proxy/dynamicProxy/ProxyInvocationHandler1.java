package com.bupt.design_pattern.proxy.dynamicProxy;

import javax.sql.DataSource;
import java.lang.reflect.*;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-16 17:15
 * @description: 动态代理1
 **/
public class ProxyInvocationHandler1 {
    public static void main(String[] args) throws Throwable {


//        //1. 得到接口组成的代理class对象
//        Class proxyClazz = Proxy.getProxyClass(DataService.class.getClassLoader(),
//                DataService.class.getInterfaces());
//        //2. 由class反射得到构造器 代表获得的应该是入口参数是InvocationHandler的构造器
//        Constructor constructorProxyImpl = proxyClazz.getConstructor(InvocationHandler.class);
//        //3. 调用反射的构造方法创建对象
//        DataService dataServiceProxy = (DataService) constructorProxyImpl.newInstance(new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                DataService dataService = new DataServiceImpl();
//                dataService.add();
//                return null;
//            }
//        });

        //上面的编码属于硬编码，代理不同的对象需要修改invoke()创建不同实现类，修改为传入目标对象 创建一个getProxy()方法
        DataService dataService = new DataServiceImpl();
        DataService proxy = (DataService)getProxy(dataService);
        proxy.add();
        proxy.delete();
    }

    public static Object getProxy(final Object target) throws Throwable{


        //1. 得到接口组成的代理class对象
        Class proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(),
                target.getClass().getInterfaces());
        //2. 由class反射得到构造器 代表获得的应该是入口参数是InvocationHandler的构造器
        Constructor constructorProxyImpl = proxyClazz.getConstructor(InvocationHandler.class);
        //3. 调用反射的构造方法创建对象
        Object proxy = constructorProxyImpl.newInstance(new InvocationHandler() {
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
