package com.itheima.demo02.CopyFile;

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\workspace\\projects\\python\\spider\\myspiders\\wallhavenSpider\\wallhaven\\wallhaven-2eq1gy.jpg");
        FileOutputStream fos = new FileOutputStream("day10_IO\\1.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes);
        }
        long end = System.currentTimeMillis();
        bos.close();
        bis.close();
        System.out.println("复制消耗的时间：" + (end - start) + "毫秒");

    }
}
