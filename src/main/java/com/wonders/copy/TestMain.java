package com.wonders.copy;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-05-04
 * @modifiedBy
 */
public class TestMain {
    public static void main(String[] args) {
        //检验单信息inspectInfo
        C c=new C();
        //TODO 检验的明细拷贝了吗？
        A a=new A();
        a.setName("aName");
        a.setId(1);
        List<B> bs=new ArrayList<>();
        B b1=new B();
        b1.setBName("b1");
        B b2=new B();
        b2.setBName("b2");
        bs.add(b1);
        bs.add(b2);
        a.setBList(bs);
        BeanUtils.copyProperties(a,c);
        System.out.println(c.toString());
    }
}
