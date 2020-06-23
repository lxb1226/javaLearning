package com.itheima.demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次读取多个字节
        `int read(byte[] b)`，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回`-1`

    String类的构造方法：
        String(byte[] bytes):

 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("day09_IOAndOutputStream\\b.txt"));
//        byte[] bytes = new byte[2];
//
//        int len = fis.read(bytes);
//        System.out.println(len);
////        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();

    }
}
