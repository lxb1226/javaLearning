package com.itheima.demo02.Map;
/*
    HashMap存储自定义键值对
    Map集合保证key唯一
        作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
        HashMap存储自定义类型键值
     */
    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("女王", 18), "毛里求斯");

        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for(Map.Entry<Person, String> entry : entries){
            Person key = entry.getKey();
            String name = entry.getValue();
            System.out.println(key + "-->" + name);
        }
    }

    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));

        Set<String> set = map.keySet();
        for(String key: set){
            Person person = map.get(key);
            System.out.println(key + "-->" + person);
        }
    }
}
