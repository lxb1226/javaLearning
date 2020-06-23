package com.itheima.demo01.File;

import java.io.File;

/*
 * `public String[] list()` ：返回一个String数组，表示该File目录中的所有子文件或目录。


 * `public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 *
 * 注意：
 *      list方法和listFiles方法遍历的是构造方法中给出的目录
 *  如果构造方法中给出的目录路基不存在，会抛出空指针异常
 * 如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        show02();
//        show01();
    }

    private static void show02() {
        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase");
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }

    private static void show01() {
        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase");
        String[] arr = file.list();
        for(String filename: arr){
            System.out.println(filename);
        }
    }
}
