package com.wonders.basic.reflection;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 反射的测试类Apple ps:@Data注解是兼备了get set toString的
 * @date Created in 2019-06-06
 * @modifiedBy
 */
public class Apple {
    /**
     * public clz.getFields()才能显示获取到
     */
    public int price;
    public String name;
    public void setPrice(int price){
        this.price=price;
        System.out.println(this.price);
    }
}
