package com.itheima.demo03.Generic;

/*
定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间

格式：
    修饰符 <泛型> 返回值类型 方法名（参数列表（使用泛型)）{}

    含有泛型的方法，在调用方法时确实泛型的数据类型
 */
public class GenericMethod {

    // 定义一个含有泛型的方法
    public <M> void metho01(M m){
        System.out.println(m);
    }

    // 定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }
}