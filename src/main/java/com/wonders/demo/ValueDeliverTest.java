package com.wonders.demo;

import lombok.Data;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 值传递
 * @date Created in 2019-06-07
 * @modifiedBy
 */
public class ValueDeliverTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("引用类型before:"+circle);
        changeCircleRValue(circle);
        System.out.println("引用类型after:"+circle);


        int a=1;
        System.out.println("int基本类型before:"+a);
        changeIntValue(a);
        System.out.println("int基本类型after:"+a);

        Integer b=3;
        System.out.println("Integer基本类型before:"+b);
        changeIntegerValue(a);
        System.out.println("Integer基本类型after:"+b);


    }

    private static void changeCircleRValue(Circle circle){
        //code1 输出2
        circle=new Circle(3);
        //code2 输出3
        //circle.setR(3);
    }

    /**
     * int基本类型
     * @param value
     */
    private static void changeIntValue(int value){
        value=2;
    }

    /**
     * Integer包装类
     * @param value
     */
    private static void changeIntegerValue(Integer value){
        value=4;
    }
}

@Data
class Circle {
    /**
     * 半径
     */
    private int r;

    public Circle(int r) {
        this.r = r;
    }
}
