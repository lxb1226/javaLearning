package com.itheima.demo05.Thread;

/*
    主线程：执行主方法的线程

    单线程程序：java程序中只有一个线程
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2 = new Person("旺财");
        p2.run();
    }
}
