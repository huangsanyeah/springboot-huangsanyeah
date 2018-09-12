package com.wonders.string;

import java.util.Arrays;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-15 13:35
 * @ModifiedBy
 * @Version v1.0
 */
public class StringSplit {
    /**
     * @Description: String字符串的split转数组问题
     **/

    public static void main(String[] args) {
        String str = ",aa,bb,cc,dd,,,";
        String[] arrayStr = str.split(",");
        //结果是5，而不是预想中的8
        System.out.println(arrayStr.length);
        System.out.println(arrayStr.toString());
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }

        /**
         * @Description:
         * "aa12sas32sasa223sas12as12wqe"//去掉数字，然后弄成数组
         * "aa,,sas,,sasa,,,,sasas,,,"//去掉逗号，不管几个逗号，都去掉
         * "aa  sas sa sa     sas  as  "//去掉空格，也不管几个
         **/

        String ss = "aa12sas32sasa223sas12as12wqe";
        String[] array = ss.split("[\\d]+");
        System.out.println(Arrays.toString(array));
        ss = "aa,,sas,,sasa,,,,sasas,,,";
        array = ss.split("[,]+");
        System.out.println(Arrays.toString(array));
        ss = "aa  sas sa sa     sas  as  ";
        array = ss.split("[\\s]+");
        System.out.println(Arrays.toString(array));
    }
}
