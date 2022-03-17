package com.bupt.rpcDemo.client;

import com.bupt.rpcDemo.domain.User;
import com.bupt.rpcDemo.domain.UserService;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:13
 * @description:
 **/
public class Stub {

    public static UserService getSub(){
        //创建代理类
        Object o = Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //1. 绑定端口
                Socket socket = new Socket("127.0.0.1", 8888);

                //2. 将参数使用socket发送
                //2.1 定义输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //2.2 获得参数
                String methodName = method.getName();
                Class<?>[] parameterTypes = method.getParameterTypes();
                oos.writeUTF(methodName);
                oos.writeObject(parameterTypes);
                oos.writeObject(args);
                oos.flush();


                //3.使用Socket 接收返回数据
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User user = (User)ois.readObject();

                oos.close();
                socket.close();
                return user;
            }
        });
        return (UserService)o;
    }

}
