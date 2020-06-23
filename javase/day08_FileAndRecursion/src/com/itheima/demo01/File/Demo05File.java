package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

/*
    - `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    - `public boolean delete()` ：删除由此File表示的文件或目录。
    - `public boolean mkdir()` ：创建由此File表示的目录。
    - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
//        show01();
        show02();
    }

    /*
        - `public boolean mkdir()` ：创建由此File表示的目录。创建单级文件夹
        - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。 创建多级文件夹
     */
    private static void show02() {
        File f1 = new File("day08_FileAndRecursion\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:" + b1);

        File f2 = new File("day08_FileAndRecursion\\111\\222\\333\\4444");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:" + b2);

    }

    /*
        `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
         创建文件的路径和名称在构造方法中给出
         注意：
            1.此方法只能创建文件，不能创建文件夹
            2.创建文件的路径必须存在
     */
    private static void show01() throws IOException {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase\\day08_FileAndRecursion\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:" + b1);

        File f2 = new File("day08_FileAndRecursion\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2:" + b2);


    }
}
