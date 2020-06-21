package com.itheima.demo01.Object;

import java.util.ArrayList;

/**
 * java.lang.Object类
 * java.lang.Object 类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例
 * 化的时候，最终找的父类就是Object。
 * 如果一个类没有特别指定父类， 那么默认则继承自Object类
 */
public class Demo01ToString {
    public static void main(String[] args) {
        /**
         * Person类默认继承了Object类，所以可以使用Object类中的toSting方法
         *
         */

        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);// com.itheima.demo01.Object.Person@1b6d3586

        // 直接打印对象的名字，其实就是调用对象的toString方法， p = p.toString()
        System.out.println(p); // Person{name='张三', age=18}

        // 看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
        // 如果没有重写toString方法，那么输出的就是地址值



    }
}
