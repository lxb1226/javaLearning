package com.itheima.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/*
    序列化集合

 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("张三", 15));
        persons.add(new Person("李四", 20));
        persons.add(new Person("王五", 30));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO\\persons.txt"));
        for(Person p: persons){
            oos.writeObject(p);
        }
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\persons.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;
        for(Person p:list){
            System.out.println(p);
        }

        ois.close();
    }
}
