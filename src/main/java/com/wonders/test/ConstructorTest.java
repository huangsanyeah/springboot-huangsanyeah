package com.wonders.test;

/**
 * @Description 构造器 注意无参构造器
 * @Author huangweiyue
 * @Date Created in 2018-06-27 21:23
 * @ModifiedBy
 * @Version v1.0
 */
public class ConstructorTest {
    private String name;
    private Integer age;

    public ConstructorTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //    public ConstructorTest() {
    //}
    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest("郭芙蓉", 22);
        //一旦自定义了构造器 那么系统就不提供默认构造器 ConstructorTest就不能通过new ConstructorTest();方式创建了 因为改类种不包含了无参构造器
        //解决办法可以写多个构造器 包含无参的构造器

        //ConstructorTest con=new ConstructorTest();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
