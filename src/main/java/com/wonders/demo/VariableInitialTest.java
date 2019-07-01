package com.wonders.demo;

/**
 * @Description 测试成员变量和局部变量初始化的问题 局部变量除了形参需要显式的初始化 如 int b    成员变量则不需要 如 int a
 * @Author huangweiyue
 * @Date Created in 2018-06-27 18:15
 * @ModifiedBy
 * @Version v1.0
 */
public class VariableInitialTest {
    //成员变量就不需要显示的初始化,会默认初始化
    int a;

    public static void main(String[] args) {
        //局部变量除了形参外必须显式的初始化
        int b;
        //局部变量不属于任何类或者实例（对象）,它总是保存在所在方法的栈内存中，栈内存中的变量无须系统回收，往往随方法或者代码块的执行而结束
        //因为局部变量仅仅保存进本类型的值或者对象的引用
//        System.out.println(b);
    }
}
