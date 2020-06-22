package com.itheima.demo03.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        /*
        调用含有泛型的方法method01
        传递什么类型，泛型就是什么类型。
         */

        gm.metho01(10);
        gm.metho01("abc");
        gm.metho01(1.1);

        gm.method02("静态方法，不建议创建对象使用.");
        GenericMethod.method02("静态方法");


    }
}
