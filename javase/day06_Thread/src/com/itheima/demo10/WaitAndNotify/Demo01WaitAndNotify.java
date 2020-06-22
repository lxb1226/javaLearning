package com.itheima.demo10.WaitAndNotify;

/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程（消费者）：
        创建一个老板线程（生产者）：
    注意：
        顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
        同步使用的锁对象必须保证是唯一的
        只有锁对象才能调用wait和notify方法

    Object类的方法
    void wait()
    void notify()
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();
        // 创建一个消费者
        new Thread(){
            @Override
            public void run() {
                // 一直等着买包子
               while(true){
                   // 保证等待和唤醒的线程只有一个执行，需要使用同步技术
                   synchronized (obj){
                       System.out.println("告知老板要的包子的种类和数量：");
                       // 调用wait方法，进入到WAITTING状态
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       // 唤醒之后执行的代码
                       System.out.println("包子已经做好了，开吃");
                       System.out.println("-----------------------");
                   }
               }
            }
        }.start();
        // 创建一个老板线程（生产者）
        new Thread(){
            @Override
            public void run() {
               while(true){
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (obj){
                       System.out.println("老板5秒后做好包子，告知顾客可以吃包子了。");
                       obj.notify();
                   }
               }
            }
        }.start();
    }
}
