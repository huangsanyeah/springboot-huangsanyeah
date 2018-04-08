package com.wonders.entity;

import com.wonders.validator.CustomAnnotation;
import lombok.Data;

import java.io.Serializable;

/**
 * @author huangweiyue
 * @date 2018-04-04 14:34
 * validator数据校验实体类
 */
@Data
public class DemoModel implements Serializable {
    @CustomAnnotation(message = "地址校验失败")
    private String address;
}
