package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    HashSet 自定义类型元素
    set集合报错元素唯一：
        存储的元素....，
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }

}
