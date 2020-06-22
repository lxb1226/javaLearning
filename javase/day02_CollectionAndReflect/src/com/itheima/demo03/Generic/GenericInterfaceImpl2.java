package com.itheima.demo03.Generic;

/*
    含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
    就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 */
public class GenericInterfaceImpl2<T> implements GenericInterface<T>{
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
