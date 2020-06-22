package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
    注意：
        需要实现Comparable接口
 */

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02, "a", "c", "b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
