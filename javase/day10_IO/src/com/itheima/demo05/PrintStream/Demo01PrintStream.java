package com.itheima.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrinStream:打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值来表示形式
    PrintStream特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream永远不会抛出IOException
        3.有特有的方法
            void print()
            void println()
    构造方法：
        1.PrintStream(File file)
        2.PrintStream(OutputStream out)
        3.PrintSTream(String filename)
    PrintStream extends OutputStream
    注意：
        如果使用继承自父类的write方法写数据，那么查看数据的时候回查询编码表
        如果使用自己特有的方法print/println方法写数据，写的数据原样输出，
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("day10_IO\\print.txt");
        ps.write(97);
        ps.print(97);
        ps.close();
    }
}
