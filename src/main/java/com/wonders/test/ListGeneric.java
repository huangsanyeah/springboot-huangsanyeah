package com.wonders.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 《码出高效》 list泛型
 * @date Created in 2019-06-28
 * @modifiedBy
 */
public class ListGeneric {
    public static void main(String[] args) {
        List a1=new ArrayList();
        a1.add(new Object());
        a1.add(new Integer(111));
        a1.add(new String("hello a1a1"));
        //System.out.println(a1);


        List<Object> a2=a1;
        a2.add(new Object());
        a2.add(new Integer(222));
        a2.add(new String("hello a2a2"));
        System.out.println(a2);

        List<Integer> a3=a1;
        a3.add(new Integer(333));
        //a3.add(new Object());
        //a3.add(new String("hello a3a3"));

        List<?> a4=a1;
        a4.remove(0);
        a4.clear();
        //a4.add(new Object());

    }
}
