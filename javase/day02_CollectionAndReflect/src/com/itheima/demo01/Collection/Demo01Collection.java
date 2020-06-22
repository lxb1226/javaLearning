package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口：
 * Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：
 *
     * * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
     * * `public void clear()` :清空集合中所有的元素。
     * * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
     * * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
     * * `public boolean isEmpty()`: 判断当前集合是否为空。
     * * `public int size()`: 返回集合中元素的个数。
     * * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);

        // `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1); // b1:true
        System.out.println(coll); // [张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        // `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        coll.remove("赵六");
        System.out.println(coll);

        // `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        boolean b4 = coll.contains("李四");
        System.out.println("b4:" + b4);

        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6);

        System.out.println(coll.size());

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();
        System.out.println(coll);

    }
}
