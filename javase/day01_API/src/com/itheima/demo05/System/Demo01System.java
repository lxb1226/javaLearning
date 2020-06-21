package com.itheima.demo05.System;

import java.util.Arrays;

/**
 * `java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
 *
 * - `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
 * - `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
 */
public class Demo01System {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /**
     * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
     */
    private static void demo02() {
        // 定义一个源数组
        int[] src = {1,2,3, 4,5};
        // 定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前"+ Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后"+ Arrays.toString(dest));

    }

    /**
     *  `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
     *  用来测试程序的效率
     */
    private static void demo01() {
        long start = System.currentTimeMillis();
        for(int i = 1; i <= 9999; i++)
            System.out.println(i);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
