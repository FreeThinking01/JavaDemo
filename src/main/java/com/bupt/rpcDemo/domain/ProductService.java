package com.bupt.rpcDemo.domain;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:10
 * @description:
 **/
public interface ProductService {
    Product findProductById(Integer id);
}
