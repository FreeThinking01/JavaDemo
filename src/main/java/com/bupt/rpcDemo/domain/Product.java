package com.bupt.rpcDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: RPC
 * @author: FreeThinking
 * @create: 2022-03-14 17:07
 * @description:
 **/
@Data
@AllArgsConstructor
@ToString
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}

