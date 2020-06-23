package com.itheima.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    特有的成员方法：
        String readLine():读取一个文本行
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10_IO\\a.txt"));
//        int len = 0;
//        char[] chars = new char[1024];
//        while ((len = br.read(chars)) != -1){
//            System.out.println(new String(chars, 0, len));
//        }


        String line;
        while((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
