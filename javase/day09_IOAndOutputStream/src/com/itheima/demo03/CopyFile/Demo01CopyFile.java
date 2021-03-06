package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制读写
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\workspace\\projects\\python\\spider\\myspiders\\wallhavenSpider\\wallhaven\\wallhaven-2eq1gy.jpg");
        FileOutputStream fos = new FileOutputStream("day09_IOAndOutputStream\\1.jpg");

//        int len = 0;
//        while((len = fis.read()) != -1){
//            fos.write(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }
}
