package com.itheima.demo01.Map;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<K,V>集合
    特点：
        1.
    java.util.HashMap<K,V> implements Map<k,v>接口
    特点：
        1.底层是哈希表：查询的速度快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
       2.HashMap集合是一个无序的集合
   java.util.LinkedHashMap<k,v> extends HashMap<k,v>
   特点：
        1.底层是哈希表+链表
        2.有序的集合

   Map接口的方法：
* `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
* `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
* `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
* `boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
* `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
* `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class Demo01Map {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1:" + b1); // b1:true

        boolean b2 = map.containsKey("赵丽");
        System.out.println("b2:" + b2); // b2:false

    }

    /*
    `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
        返回值：
            key存在，返回对应的value值
            key不存在，返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Integer v1 = map.get("杨颖");
        System.out.println(v1); // 165

        Integer v2 = map.get("迪丽热巴");
        System.out.println(v2); // null
    }

    /*
    `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
                key存在，返回对应的value值
                key不存在，返回null
     */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map); // {林志玲=178, 赵丽颖=168, 杨颖=165}
        Integer v1 = map.remove("林志玲");
        System.out.println(v1); // 178
        System.out.println(map);    // {赵丽颖=168, 杨颖=165}

        Integer v2 = map.remove("林志");
        System.out.println(v2); // null

    }

    /*
    `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
        返回值：v
            存储键值对的时候，key不重复，返回null
                           key重复，返回上一个value
     */
    private static void show01() {
        // 创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰");
        System.out.println("v1:" + v1);

        String v2 = map.put("李晨", "范冰冰1");
        System.out.println("v2:" + v2);
        System.out.println(map);

    }
}
