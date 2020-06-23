package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase\\day08_FileAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for(File f: files){
            if(f.isDirectory()){
                getAllFile(f);
            }else if(f.getName().toLowerCase().endsWith(".java")){
                System.out.println(f);
            }
        }
    }
}
