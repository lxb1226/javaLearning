package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
        Set<K> KeySet()返回此映射中包含的键的Set视图
    实现步骤：
        1.使用Map集合中的方法KeySet()，把Map集合所有的key取出来，存储到一个set集合中
        2.遍历set集合
        3.获取value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }

        System.out.println("----------------");
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
