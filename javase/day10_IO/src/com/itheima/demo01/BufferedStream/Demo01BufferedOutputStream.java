package com.itheima.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutPutStream extends OutputStream
    BufferedOutputStream:字节缓冲输出流

    构造方法：
        BufferedOutputStream(OutputStream out):创建一个新的缓冲流，以将数据写入指定的底层输出流
        BufferedOutputStream(OutputStream out, int size):指定缓冲区大小

    使用步骤：
        1.创建FileOutputStream对象，构造方法中绑定输出的目的地
        2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
        3.使用write方法
        4.使用flush方法
        5.释放资源
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day10_IO\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.close();
    }
}
