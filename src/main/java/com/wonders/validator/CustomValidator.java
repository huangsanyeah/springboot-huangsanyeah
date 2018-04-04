package com.wonders.validator;

import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author huangweiyue
 * @date 2018-04-04
 */
@Slf4j
public class CustomValidator implements ConstraintValidator<CustomAnnotation, Object> {  //两个泛型分别为自定义注解和要校验的类型
    //@Autowired  //可自由注入Spring工厂的bean
    //private HelloService helloService;

    /**
     * 初始化
     */
    @Override
    public void initialize(CustomAnnotation customAnnotation) {
        log.info("my validator init");
    }

    /**
     * 校验逻辑
     *
     * @param o                          //校验的参数
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
       /* String value = helloService.sayHellp(o.toString());
        log.info(value);*/
        Boolean flag;
        if (o.equals("测试")) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
