package com.itheima.demo02.Exception;

import java.io.IOException;

/*
    finally：无论是否出现异常都会执行
    注意：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放，无论程序是否出现异常，最后都要资源释放
 */
public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }


    public static void readFile(String filename) throws IOException {
        /*
        如果传递的路径不是.txt结果
        那么就跑出IO异常对象
         */

        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题， 读取文件");
    }
}
