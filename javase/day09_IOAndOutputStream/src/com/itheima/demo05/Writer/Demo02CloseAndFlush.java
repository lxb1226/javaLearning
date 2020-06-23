package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    flush方法和close方法的区别
        -flush:刷新缓冲区，流可以继续使用
        -close:先刷新缓冲区，再释放资源，流对象不可以再被使用了
 */
public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndOutputStream\\e.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
