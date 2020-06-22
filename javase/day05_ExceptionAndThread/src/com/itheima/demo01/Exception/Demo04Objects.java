package com.itheima.demo01.Exception;

import java.util.Objects;

/*
    Objects类的静态方法
    `public static <T> T requireNonNull(T obj)`:查看指定引用对象不是null。
 */
public class Demo04Objects {

    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        if(obj == null){
//            throw new NullPointerException("传递的对象的值是null");
//        }
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值是null");
    }
}
