package com.itheima.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的特性
    在try的后边可以增加一个()，在括号中可以定义流对象
    那么这个流对象的作用域在try中有效
    try中的代码执行完毕，会自动把流对象释放，不用写finally
    格式：
        try(定义流对象，定义流对象..){
        }catch(异常类变量 变量名){
        }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("E:\\workspace\\projects\\python\\spider\\myspiders\\wallhavenSpider\\wallhaven\\wallhaven-2eq1gy.jpg");
             FileOutputStream fos = new FileOutputStream("day09_IOAndOutputStream\\2.jpg");) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


//        int len = 0;
//        while((len = fis.read()) != -1){
//            fos.write(len);
//        }


    }
}
