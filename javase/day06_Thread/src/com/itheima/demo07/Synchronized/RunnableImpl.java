package com.itheima.demo07.Synchronized;

/*
    解决线程安全问题的一种方案：使用同步代码块
    格式：
        synchronized(锁对象){
                可能会出现线程安全问题的代码（访问了共享数据的代码）
       }
    注意：
        1.通过代码块中锁对象，可以使用任意的对象
        2.但是必须保证多个线程使用的是锁对象是同一个
        3.锁对象作用
            把同步代码块锁住，只让一个线程在同步代码块中执行
 */


public class RunnableImpl implements Runnable{
    private int ticket = 100;

    // 创建一个锁对象
    Object obj = new Object();

    // 设置线程任务，卖票
    @Override
    public void run() {
        while(true){
            // 同步代码块
            synchronized (obj){
                // 先判断票是否存在
                if(ticket > 0){
                    // 提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 票存在，卖票,ticket--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket +"张票");
                    ticket--;
                }
            }
        }
    }
}
