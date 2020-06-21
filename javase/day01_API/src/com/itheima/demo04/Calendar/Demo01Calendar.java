package com.itheima.demo04.Calendar;

import java.util.Calendar;

/**
 * java.util.Calendar类
 * Calendar是一个抽象类，里边提供了和多操作日历字段的方法
 * Calendar类无法直接创建对象使用，里边有一个静态方法getInstance（），该方法返回Calendar类的子类对象
 *
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
