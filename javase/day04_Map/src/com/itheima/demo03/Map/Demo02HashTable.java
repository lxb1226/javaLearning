package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<k,v> implements Map<K,V>接口

    Hashtable:底层也是一个哈希表，线程安全，单线程，速度慢
    HashMap:底层是一个哈希表，线程不安全，多线程，速度快

    HashMap:可以存储null值，null键
    Hashtable:不能存储null值，null键

    Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合取代了
    Hashtable的子类Properties依然活跃


 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, "a"); // java.lang.NullPointerException
        System.out.println(table);
    }
}
