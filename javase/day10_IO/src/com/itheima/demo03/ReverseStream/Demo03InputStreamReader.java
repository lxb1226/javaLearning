package com.itheima.demo03.ReverseStream;

/*
    java.io.InputStreamReader extends InputStream
    InputStreamReader:是字节流通向字符流的路径

    注意事项：构造方法中指定的编码表需要和文件的编码相同，否则会发生乱码
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
//        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\gbk.txt"), "gbk");
        int len = 0;
        while((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\utf_8.txt"), "utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\utf_8.txt"));
        int len = 0;
        while((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
