package com.wonders.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description spring的Validator参数校验器
 * @date Created in 2019-04-21
 * @modifiedBy
 */
public class UserValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
