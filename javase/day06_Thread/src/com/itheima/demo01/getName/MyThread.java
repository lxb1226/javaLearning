package com.itheima.demo01.getName;

/*
    getName()：获取线程的名字
 */
public class MyThread extends Thread{
    // 重写Thread类中的run方法

    @Override
    public void run() {
        // 获取线程名称
//        String name = getName();
//        System.out.println(name);
//        Thread t = Thread.currentThread();
//        System.out.println(t);
        System.out.println(Thread.currentThread().getName());
    }
}
