package com.wonders.test;

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
        changeCircleRValue(circle);
        System.out.println(circle);
    }

    private static void changeCircleRValue(Circle circle){
        //code1 输出2
        circle=new Circle(3);
        //code2 输出3
        //circle.setR(3);
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
