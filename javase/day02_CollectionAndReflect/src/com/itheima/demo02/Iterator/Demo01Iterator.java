package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 *      * `public E next()`:返回迭代的下一个元素。
 *      * `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
 *
 *      Iterator迭代器：是一个接口，我们无法直接使用，需要使用Iterator接口的实现对象，获取实现类的方法比较特殊
 *      Collection接口中有一个方法，叫iterator(),这个方法返回的就是迭代器的实现类对象
 *          Iterator<E> itetator()返回在此collection的元素上进行迭代的迭代器
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");



        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
