package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List 接口 extends Collection接口
 * 特点：
 *      1.有序
 *      2.有索引
 *      3.重复元素
 *
 *      - `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
 *      - `public E get(int index)`:返回集合中指定位置的元素。
 *      - `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
 *      - `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
 *
 *     注意：
 *          操作索引的时候，一定要防止索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        System.out.println(list);

        // `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
        list.add(3, "itheima");
        System.out.println(list);   // [a, b, c, itheima, d, a]

        // `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
        String removeE = list.remove(2);
        System.out.println("被移除的元素：" + removeE);
        System.out.println(list); //[a, b, itheima, d, a]

        // `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String setE = list.set(4, "A");
        System.out.println("被替换的元素：" + setE);
        System.out.println(list); // [a, b, itheima, d, A]

        //List集合遍历方式
        // 1.
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("------------------");
        // 2.使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------");
        for(String s: list){
            System.out.println(s);
        }


    }
}
