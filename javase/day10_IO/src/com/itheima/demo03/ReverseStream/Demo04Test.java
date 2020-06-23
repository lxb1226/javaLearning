package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\gbk.txt"), "gbk");
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("day10_IO\\utf_8.txt"), "utf-8");
        int len = 0;
        while((len = isr.read()) != -1){
            osr.write(len);
        }
        isr.close();
        osr.close();

    }
}
