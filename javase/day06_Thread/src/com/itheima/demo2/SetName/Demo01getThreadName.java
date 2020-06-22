package com.itheima.demo2.SetName;

public class Demo01getThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        new MyThread("旺财").start();

    }
}
