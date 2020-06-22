package com.itheima.demo06.Thread;

/*
    创建多线程程序的第一种方式：创建Thread类的子类
    java.lang.Thread类：描述线程的类，我们想要实现多线程的程序，就必须继承Thread类

    实现步骤：
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类的run方法，设置线程任务
        3.创建Thread类的子类对象
        4.调用Thread类的start方法，开启新的线程，执行run方法
            结果是两个线程并发的运行，当前线程和另一个线程
            多次启动一个线程是非法的。
     java程序是属于抢占式调度，那个线程的优先级高，那个线程优先执行。
 */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
