package com.itheima.demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndOutputStream\\c.txt");
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
