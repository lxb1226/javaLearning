package com.itheima.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        - public void write(byte[] b):
        - public void write(byte[] b, int off, int len):

 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("E:\\workspace\\projects\\java\\itcast\\javase\\day09_IOAndOutputStream\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是正数，那么显示的时候会查找ASCII表
                如果写的第一个字节是负数，那么第一个字节和第二个字节会显示中文
         */
        byte[] bytes = {65, 66, 67, 68, 69};
//        byte[] bytes = {-65, -66, -67, 68, 69};
        fos.write(bytes);

        /*
        public void write(byte[] b, int off, int len):将字节数组的一部分写入文件中
         */
        fos.write(bytes, 1, 2);

        /*
        写入字符的方法：可以使用String类中的方法把字符串转换字节数组
            byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes2);
        fos.close();
    }
}
