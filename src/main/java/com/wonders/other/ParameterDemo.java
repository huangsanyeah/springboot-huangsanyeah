package com.wonders.other;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 阿里码出高效p66参数
 * @date Created in 2018-11-08
 * @modifiedBy
 */
public class ParameterDemo {
    private static StringBuilder stringBuilderStatic = new StringBuilder("old stringBuilder");

    public static void main(String[] args) {
        method(stringBuilderStatic, stringBuilderStatic);
        System.out.println(stringBuilderStatic);
    }

    public static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
        stringBuilderStatic1.append(".method.first-");
        stringBuilderStatic2.append(".method.second-");

        stringBuilderStatic1 = new StringBuilder("new stringBuilder");
        stringBuilderStatic1.append("new methods append");
    }
}
