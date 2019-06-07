package com.wonders.basic.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 反射的测试类
 * @date Created in 2019-06-06
 * @modifiedBy
 */
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //普通方式创建对象
        /*com.wonders.basic.reflection.Apple apple = new com.wonders.basic.reflection.Apple();
        apple.setPrice(4);
        System.out.println(apple);*/

        //通过反射方式调用 反射就是在运行时才知道要操作的类是什么，并且可以在运行时获取类的完整构造，并调用对应的方法。

        //获取Class对象shi'li
        Class clz = Class.forName("com.wonders.basic.reflection.Apple");
        //获取该类
        Field[] fields=clz.getFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
        Method method = clz.getMethod("setPrice", int.class);
        Constructor constructor = clz.getConstructor();
        Object object = constructor.newInstance();
        method.invoke(object, 5);
    }
}
