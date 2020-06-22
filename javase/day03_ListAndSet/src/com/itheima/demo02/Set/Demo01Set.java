package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1.不重复
        2.没有索引
    java.util.HashSet集合 implemetns Set接口
    特点：
        1.不重复
        2.没索引
        3.无序
        4.底层是哈希表结构
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // 使用迭代器遍历
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");
        // 增强for遍历
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
