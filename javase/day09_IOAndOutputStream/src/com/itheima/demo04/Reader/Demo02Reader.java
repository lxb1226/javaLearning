package com.itheima.demo04.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    java.util.Reader:字符输入流，抽象类
    共性方法：
        - `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
        - `public int read()`： 从输入流读取一个字符。
        - `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
    java.io.FileReader extends InputStreamReader extends Reader
    FileReader:文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读入内存
    构造方法：
        - `FileReader(File file)`： 创建一个新的 FileReader ，给定要读取的File对象。
        - `FileReader(String fileName)`： 创建一个新的 FileReader ，给定要读取的文件的名称。
    字符输入流的使用步骤：
        1.创建FileReader对象，构造方法中绑定要读取的数据源
        2.读取文件
        3.释放资源

 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day09_IOAndOutputStream\\c.txt");
//        int len = 0;
//        while((len = fr.read()) != -1){
//            System.out.println((char)len);
//        }
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len));
        }
        fr.close();
    }
}
