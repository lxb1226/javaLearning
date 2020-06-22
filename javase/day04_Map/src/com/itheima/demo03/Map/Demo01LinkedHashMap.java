package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链表实现，有序
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);


        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);

    }
}
