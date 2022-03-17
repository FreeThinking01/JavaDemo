package com.bupt.rpcDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

}
