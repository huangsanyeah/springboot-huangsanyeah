package com.wonders.interview.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/***
 * @description 反射
 * @author huangweiyue
 * @date Created in 2019/7/20-22:40
 */
public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        Class rc = Class.forName("com.wonders.interview.reflect.Robot");
        Robot r = (Robot) rc.newInstance();
        System.out.println("Class name is " + rc.getName());
        //getDeclaredMethod*()获取的是类自身声明的所有方法，包含public、protected和private方法。
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str = getHello.invoke(r, "Bob");
        System.out.println("getHello result is " + str);
        //getMethod*()获取的是类的所有共有方法，这就包括自身的所有public方法，和从基类继承的、从接口实现的所有public方法。
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(r, "Welcome");
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r, "Alice");
        sayHi.invoke(r, "Welcome");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

    }
}
