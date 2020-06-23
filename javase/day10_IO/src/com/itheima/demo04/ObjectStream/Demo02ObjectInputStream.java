package com.itheima.demo04.ObjectStream;

import java.io.*;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream:对象的反序列化流
    作用：把文件中保存的对象，以流的方式读取出来

    构造方法：
        ObjectInputStream(InputStream is):
    特有的成员方法：
        Object readObject()
    readObject声明抛出了ClassNotFoundException(class文件找不到异常）
    当不存在对象的class文件时抛出此异常
    反序列化的前提：
        1.类必须实现Serializable
        2.必须存在类对应的class文件
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\person.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
        Person p = (Person)o;
        System.out.println(p);
    }
}
