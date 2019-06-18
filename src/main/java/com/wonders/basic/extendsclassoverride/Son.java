package com.wonders.basic.extendsclassoverride;

import lombok.Data;

/**
 * @description 父子类定义了同名实例变量的情况
 * @date Created in 2019-06-08
 */
@Data
public class Son extends Father{
    public int a=7;
    public void sonPrint(){
        //就是this.a
        System.out.println(a);
    }
    public void fatherPrint(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Son son=new Son();
        //7
        son.sonPrint();
        //5
        son.fatherPrint();
    }

}
