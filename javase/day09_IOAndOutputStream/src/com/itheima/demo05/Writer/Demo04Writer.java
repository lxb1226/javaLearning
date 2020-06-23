package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndOutputStream\\g.txt", true);
        for(int i = 0; i < 10; i++){
            fw.write("helloword" + i + "\r\n");

        }
        fw.close();
    }
}
