package com.itcast.annotation.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;

/**
 * 简单的测试框架
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.获取字节码文件对象
        Class<? extends Calculator> cls = c.getClass();
        // 3.获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        // 4.判断方法上是否有Check注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                // 5.有，执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    // 6.捕获异常
                    number++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因:" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------");
                    bw.newLine();
//                    e.printStackTrace();
                }
            }
        }
        bw.write("本次测试一共出现" + number + "异常");
        bw.close();

    }
}
