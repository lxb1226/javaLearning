package com.itheima.demo03Filter;

import java.io.File;

/*
    `java.io.FileFilter`是一个接口，是File的过滤器。 该接口的对象可以传递给File类的`listFiles(FileFilter)` 作为参数， 接口中只有一个方法。

    `boolean accept(File pathname)  ` ：测试pathname是否应该包含在当前File目录中，符合则返回true。


    File[] listFiles(FileFilter filter):
    java.io.FileFilter接口：用于抽象路径名的过滤器
        作用：用来过滤文件的方法
        抽象方法
            `boolean accept(File pathname)  ` ：测试pathname是否应该包含在当前File目录中，符合则返回true。
            参数：
                File pathname:使用ListFiles方法遍历目录，得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
        作用：用于过滤文件名称
        抽象方法：
            boolean accept(File dir, String name):测试指定文件是否应该包含在某一文件列表中
            参数：
                File dir:构造方法中传递的被遍历的目录
                String name: 使用ListFiles方法遍历目录，获得每一个文件或文件夹的名称

    注意：
        两个过滤器接口是没有实现类的，需要我们自己重写实现类，定义accept方法
 */

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase\\day08_FileAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());
        for(File f: files){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
