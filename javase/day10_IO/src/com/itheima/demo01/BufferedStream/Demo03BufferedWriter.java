package com.itheima.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter:字符缓冲输出流

    构造方法：
        BufferedWriter(Writer out):
        BufferedWriter(Writer out, int sz):

    特有的成员方法
        void newLine():写一个行分隔符。
 */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day10_IO\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i < 10 ;i++){
            bw.write("哈哈哈哈哈，BufferedWriter");
            bw.newLine();
        }
        bw.close();
        fw.close();

    }
}
