package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndOutputStream\\f.txt");
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cs);
        fw.write(cs, 1, 3);
        fw.write("传智播客");
        fw.write("黑马程序员", 2, 3);
        fw.close();
    }
}
