package com.wonders.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author huangweiyue
 * @date 2018-04-04 14:36
 */
@Target({ElementType.METHOD,ElementType.FIELD})  //注解作用域
@Retention(RetentionPolicy.RUNTIME)  //注解作用时间
@Constraint(validatedBy = CustomValidator.class) //执行校验逻辑的类
public @interface CustomAnnotation {

    //校验不过时候的信息
    String message() default "{---注解无message提示时，默认message---}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
