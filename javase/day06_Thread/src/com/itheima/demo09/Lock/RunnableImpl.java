package com.itheima.demo09.Lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    解决线程安全问题的三种方案：使用Lock锁
    java.util.concurrent.Locks.Lock接口
    Lock实现提供了比使用synchronized方法和语句可获得更广泛的锁定操作
    Lock接口中的方法：
        void Lock()获取锁
        void unlock()释放锁
    java.util.concurrent.locks.ReentrantLock implements Lock接口

    使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口中的lock获取所
        2.在可能会出现安全问题的代码后调用Lock接口中的unlock释放锁
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    // 1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while(true){

            l.lock();
            try {
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
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }

        }
    }

    // 设置线程任务，卖票
//    @Override
//    public void run() {
//        while(true){
//
//            l.lock();
//            // 先判断票是否存在
//            if(ticket > 0){
//                // 提高安全问题出现的概率，让程序睡眠
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                // 票存在，卖票,ticket--
//                System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket +"张票");
//                ticket--;
//            }
//            l.unlock();
//        }
//    }
}
