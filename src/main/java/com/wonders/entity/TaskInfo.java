package com.wonders.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huangweiyue
 * @date 2018-03-28 17:15
 */
@Data
public class TaskInfo implements Serializable{
    private String jobClassName;
    private String jobGroupName;
    private String cronExpression;
}
