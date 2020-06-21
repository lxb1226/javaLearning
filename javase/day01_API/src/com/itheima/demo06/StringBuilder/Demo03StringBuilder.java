package com.itheima.demo06.StringBuilder;

/**
 * StringBuilder和String相互转换
 *  String->StringBuilder：通过构造方法
 *  StringBuilder->String:toString
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu:" + bu);

        String s = bu.toString();
        System.out.println(s);
    }
}
