package com.itheima.demo01.File;

import java.io.File;

/*
    - `public boolean exists()` ：此File表示的文件或目录是否实际存在。
    - `public boolean isDirectory()` ：此File表示的是否为目录。
    - `public boolean isFile()` ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    // `public boolean isDirectory()` ：此File表示的是否为目录。
    // `public boolean isFile()` ：此File表示的是否为文件。
    private static void show02() {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
    }

    /*
    `public boolean exists()` ：此File表示的文件或目录是否实际存在。
     */
    private static void show01() {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase");
        System.out.println(f1.exists());    // true
    }

}
