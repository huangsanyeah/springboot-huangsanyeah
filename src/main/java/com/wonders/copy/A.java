package com.wonders.copy;

import lombok.Data;

import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-05-04
 * @modifiedBy
 */
@Data
public class A {
    private String name;
    private int id;
    private List<B> bList;
}
