package com.wonders.test;

/**
 * @Description 尽量避免成员变量和局部变量同名的情况，如果重名，想在方法内调用成员变量 那么需要用this.来指定
 * @Author huangweiyue
 * @Date Created in 2018-06-27 19:04
 * @ModifiedBy
 * @Version v1.0
 */
public class VariableTest {
    //成员变量
    private String name = "白展堂";

    public static void main(String[] args) {
        new VariableTest().f();
    }

    //初始化代码块 name被覆盖了
    {
        name = "店小二";
    }
    private void f() {
        //局部变量
        String name = "李大嘴";
        System.out.println(name);
        System.out.println(this.name);

    }
}
