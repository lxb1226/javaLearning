package com.itheima.demo02.Iterator;

import java.util.ArrayList;

/**
 * 增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
 * 是JDK1.5之后出现的新特性
 */
public class Demo02Foreach {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s: list){
            System.out.println(s);
        }
    }

    // 使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}
