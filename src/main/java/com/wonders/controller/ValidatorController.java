package com.wonders.controller;

import com.wonders.entity.DemoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author huangweiyue
 * @date 2018-04-04
 * http://localhost:8080/validator
 * {
 * "name":"白展堂",
 * "address":"测试1"
 * }
 */
@RestController
@Slf4j
public class ValidatorController {
    @RequestMapping("/validator")
    public String testValidator(@RequestBody @Valid DemoEntity demoEntity,
                                BindingResult bindingResult) {  //这里BindingResult参数必须紧跟被@Valid注解的参数
        if (bindingResult.hasErrors()) {
            StringBuffer message = new StringBuffer();
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError oneError : allErrors) {
                message.append(oneError.getDefaultMessage()).append(";");
            }
            return message.toString();
        } else {
            return "请求成功，参数校验通过";
        }

    }

}