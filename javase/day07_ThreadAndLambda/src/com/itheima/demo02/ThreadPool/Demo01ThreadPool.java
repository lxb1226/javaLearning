package com.itheima.demo02.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池：JDK1.5之后提供
    java.util.concurrent.Executors:线程池的工厂类，用来生产线程池
    静态方法：
            `public static ExecutorService newFixedThreadPool(int nThreads)`：返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)
    java.util.concurrent.ExecutorService:线程池接口：用来从线程池中获取线程，调用start方法，执行线程任务
            `public Future<?> submit(Runnable task)`:获取线程池中的某一个线程对象，并执行
    使用线程池中线程对象的步骤：
        1. 使用线程池的工厂类Executors创建线程池对象。
        2. 创建Runnable接口子类对象。(task)
        3. 提交Runnable接口子类对象。(take task)
        4. 关闭线程池(一般不做)。
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();
    }
}
