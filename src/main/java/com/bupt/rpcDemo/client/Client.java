package com.bupt.rpcDemo.client;


import com.bupt.rpcDemo.domain.User;
import com.bupt.rpcDemo.domain.UserService;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:13
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        UserService sub = Stub.getSub();
        User id = sub.findUserById(123);
        System.out.println(id);
    }
}
