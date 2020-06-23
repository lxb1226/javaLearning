package com.itheima.demo06.trycatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前使用try.. catch ..finally处理
 */
public class Dem01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("w:\\day09_IOAndOutputStream\\g.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("helloword" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 创建对象失败，fw的默认值是null，null是不能调用方法的
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
