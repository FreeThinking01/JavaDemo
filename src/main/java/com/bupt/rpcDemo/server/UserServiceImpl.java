package com.bupt.rpcDemo.server;


import com.bupt.rpcDemo.domain.User;
import com.bupt.rpcDemo.domain.UserService;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:15
 * @description:
 **/
class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id, "Alice");
    }
}