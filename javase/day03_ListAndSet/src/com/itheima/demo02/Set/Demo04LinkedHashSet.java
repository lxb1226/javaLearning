package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet 集合 extends HashSet集合
    特点：
        底层是一个哈希表(数组+链表/红黑树）+链表：用来记录元素的存储顺序，保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new LinkedHashSet<>();
        set.add("www");
        set.add("abc");
        set.add("itcast");
        System.out.println(set); // [www, abc, itcast]有序，不允许重复
    }
}
