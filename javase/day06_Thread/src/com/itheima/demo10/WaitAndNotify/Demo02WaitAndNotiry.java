package com.itheima.demo10.WaitAndNotify;

/*
    进入到TimeWaitting（计时等待）有两种方式
    1.使用sleep(long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法，wait如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来。
 */
public class Demo02WaitAndNotiry {
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
                        System.out.println("顾客1告知老板要的包子的种类和数量：");
                        // 调用wait方法，进入到WAITTING状态
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        // 创建一个消费者
        new Thread(){
            @Override
            public void run() {
                // 一直等着买包子
                while(true){
                    // 保证等待和唤醒的线程只有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量：");
                        // 调用wait方法，进入到WAITTING状态
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2开吃");
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
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
