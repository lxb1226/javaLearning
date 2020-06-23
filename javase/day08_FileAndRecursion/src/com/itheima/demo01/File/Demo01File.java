package com.itheima.demo01.File;

import java.io.File;

/*
    java.io.File
    文件和目录路径名的抽象表示形式
    java把电脑中的文件和文件夹封装成了一个FIle类，可以使用File类对文件和文件夹进行操作
        1.创建
        2.删除
        3.获取
        4.判断
        5.遍历
        6.获取文件的大小
    File类是与系统无关的类

    重点：
        file:
        directory:
        path:
 */
public class Demo01File {
    public static void main(String[] args) {

        // 路径分隔符
        System.out.println(File.pathSeparator); // ;
        // 路径分隔符
        System.out.println(File.pathSeparatorChar); //;
        // 与系统有关的默认名称分隔符
        System.out.println(File.separator); // \
        // 与系统有关的默认名称分隔符
        System.out.println(File.separatorChar); // \


    }
}
