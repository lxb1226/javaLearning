package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写
            - `public FileOutputStream(File file, boolean append)`： 创建文件输出流以写入由指定的 File对象表示的文件。
            - `public FileOutputStream(String name, boolean append)`： 创建文件输出流以指定的名称写入文件。

    写换行：写换行符号
        windows:\r\n
        linux:\n
        maxos:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\workspace\\projects\\java\\itcast\\javase\\day09_IOAndOutputStream\\c.txt", true);
        for(int i = 1; i <= 10; i++){
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
