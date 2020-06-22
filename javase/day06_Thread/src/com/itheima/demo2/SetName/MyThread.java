package com.itheima.demo2.SetName;
/*
    设置线程的名称：
            1.setName()
            2.创建一个带参数的构造方法
 */

public class MyThread extends Thread{

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
