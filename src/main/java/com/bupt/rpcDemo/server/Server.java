package com.bupt.rpcDemo.server;

import com.bupt.rpcDemo.domain.User;
import com.bupt.rpcDemo.domain.UserService;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:14
 * @description:
 **/
public class Server {

    private static boolean running = true;

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);
        while (running){
            Socket s = server.accept();
            process(s);
            s.close();
        }
        server.close();
    }

    private static void process(Socket s) throws Exception {
        //1. 获取输入
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

        String methodName = ois.readUTF();
        Class[] parameterTypes = (Class[]) ois.readObject();
        Object[] args = (Object[]) ois.readObject();

        //2.反射构造对象
        UserService service = new UserServiceImpl();
        Method method = service.getClass().getDeclaredMethod(methodName, parameterTypes);
        User user = (User) method.invoke(service, args);

        //3. 输出
        ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
        dos.writeObject(user);
        dos.flush();

    }



}
