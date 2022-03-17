package com.bupt.rpcDemo.domain;

import java.io.Serializable;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:07
 * @description:
 **/
public interface UserService {
    User findUserById(Integer id);
}
