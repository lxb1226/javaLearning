package com.itheima.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 根据Calendar类的API文档，常用方法有：
 *
 * - `public int get(int field)`：返回给定日历字段的值。
 * - `public void set(int field, int value)`：将给定的日历字段设置为给定值。
 * - `public abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * - `public Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 *
 *  成员方法的参数：
 *      int field:日历类的字段，可以使用静态变量获取
 *
 *
 */
public class Demo02Calendar {

    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /**
     * `public Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
     */
    private static void demo04() {

        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    /**
     * `public abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
     */

    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 2);

        int year = c.get(Calendar.YEAR);
        System.out.println(year); // 2022
    }

    /**
     * `public void set(int field, int value)`：将给定的日历字段设置为给定值。
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        // 设置年为9999
        c.set(Calendar.YEAR, 9999);

        int year = c.get(Calendar.YEAR);
        System.out.println(year); // 9999
    }

    /**
     * public int get(int field)`：返回给定日历字段的值
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year); // 2020
        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 5

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }


}
