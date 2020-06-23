package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类

            - `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。
            - `public abstract int read()`： 从输入流读取数据的下一个字节。
            - `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

    java.io.FileInputStream extends InputStream：文件字节输入流
    构造方法：
        * `FileInputStream(File file)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
        * `FileInputStream(String name)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

    读取数据的原理(硬盘-->内存)：
        java程序-->JVM-->OS--OS读取数据的方法-->读取文件

    字节输入流的使用步骤（重点）：
        1.创建FileInputStream对象，构造方法中绑定要读取的对象
        2.读取文件
        3.释放资源

 */
public class Demo01Inputstream {
    public static void main(String[] args) throws IOException {
    //         1.创建FileInputStream对象，构造方法中绑定要读取的对象
        FileInputStream fis = new FileInputStream("day09_IOAndOutputStream\\a.txt");
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
