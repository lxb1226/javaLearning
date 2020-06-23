package com.itheima.demo01.File;

import java.io.File;

/*
    路径
        绝对路径：
        相对路径：
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
        File的构造方法
         */
//        show01();
//        show02();
        show03();

    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    /*
    `public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
     */
    private static void show02() {
        File f1 = new File("c:" , "a.txt");
        System.out.println(f1);
    }

    /*
    `public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。
    参数：
        String pathname:字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾
            路径可以存在，也可以不存在
     */
    private static void show01() {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase");
        System.out.println(f1);

        File f2 = new File("b.txt");
        System.out.println(f2);
    }
}
