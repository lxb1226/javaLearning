package com.itheima.demo07.Integer;

/**
 * 基本类型与字符串之间的转换：
 * 基本类型-->字符串：
 *      1.基本类型数据的值+“” 最简单的方式
 *      2.使用包装类中的静态方法
 *       toString()
 *      3.使用String类中的静态方法
 *          valueOf
 * 字符串-->基本类型：
 *      1.使用包装类的静态方法parseXXX方法
 */
public class Demo03Integer {
    public static void main(String[] args) {
        String s1 = 100 + "";
        System.out.println(s1 + 200); // 100200

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200); // 100200

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        int i = Integer.parseInt("100");
        System.out.println(i + 200); // 300


    }
}
