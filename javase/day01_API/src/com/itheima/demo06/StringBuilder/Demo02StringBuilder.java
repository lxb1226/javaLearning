package com.itheima.demo06.StringBuilder;

/**
 * 成员方法：
 *       - `public StringBuilder append(...)`：添加任意类型数据的字符串形式，并返回当前对象自身。
 *       - `public String toString()`：将当前StringBuilder对象转换为String对象。
 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        // append方法返回的是this，调用方法的对象
//        StringBuilder bu2 = bu1.append("abc");
//        System.out.println(bu1); // abc
//        System.out.println(bu2); // abc
//        System.out.println(bu1 == bu2); // true

        // 使用append方法无需接受返回值
//        bu1.append("abc");
//        bu1.append(1);
//        bu1.append(true);
//        bu1.append(8.8);
//        bu1.append("中");
//        System.out.println(bu1); // abc1true8.8中

        /*
        链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
         */

        System.out.println("abc".toUpperCase().toUpperCase().toLowerCase());
        bu1.append("abc").append(1).append(true).append(8.8).append("中");
        System.out.println(bu1);

    }
}
