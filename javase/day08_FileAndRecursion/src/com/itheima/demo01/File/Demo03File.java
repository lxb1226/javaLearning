package com.itheima.demo01.File;

/*
 * `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。

 * ` public String getPath() ` ：将此File转换为路径名字符串。

 * `public String getName()`  ：返回由此File表示的文件或目录的名称。

 * `public long length()`  ：返回由此File表示的文件的长度。
 */

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {

//        show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase\\a.txt");
        File f2 = new File("a.txt");
        String path = f1.getPath();
        System.out.println(path);

        String path2 = f2.getPath();
        System.out.println(path2);
    }

    private static void show01() {
        File f1 = new File("E:\\workspace\\projects\\java\\itcast\\javase\\a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
    }


}
