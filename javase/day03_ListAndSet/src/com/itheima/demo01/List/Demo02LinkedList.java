package com.itheima.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    特点：
        1.底层是双向链表，查询慢，增删快
        2.包含了大量操作首尾元素的方法


        * `public void addFirst(E e)`:将指定元素插入此列表的开头。
*       `public void addLast(E e)`:将指定元素添加到此列表的结尾。
*       `public E getFirst()`:返回此列表的第一个元素。
        * `public E getLast()`:返回此列表的最后一个元素。
        * `public E removeFirst()`:移除并返回此列表的第一个元素。
        * `public E removeLast()`:移除并返回此列表的最后一个元素。
        * `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
        * `public void push(E e)`:将元素推入此列表所表示的堆栈。
        * `public boolean isEmpty()`：如果列表不包含元素，则返回true。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void  show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

//        linked.clear();
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }

    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

//        linked.addFirst("www");
        linked.push("www");

        System.out.println(linked);

        linked.addLast("com");
        System.out.println(linked);
    }
}
