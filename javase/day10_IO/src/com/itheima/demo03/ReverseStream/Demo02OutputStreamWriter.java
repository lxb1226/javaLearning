package com.itheima.demo03.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter:字符流通向字节流的桥梁，可使用指定的charset将要写入流中的字符编码成字节

    构造方法：
        OutputStreamWriter(OutputStream out)
        OutputStreamWriter(OutputStream out, String charsetName)
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO\\gbk.txt"), "gbk");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    /*
    使用转换流将OutputStreamWriter写UTF-8格式文件
     */
    private static void write_utf_8() throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO\\utf_8.txt"), "utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
