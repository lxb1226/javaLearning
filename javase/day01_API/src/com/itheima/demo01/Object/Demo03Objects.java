package com.itheima.demo01.Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 ="aaa";

//        boolean b = s1.equals(s2); // NullPointerException null是不能调用方法的，会抛出空指针异常

        /**
         * Objects类的equals方法：对两个对象进行比较
         * public static boolean equals(Object a, Object b) {
         *         return (a == b) || (a != null && a.equals(b));
         *     }
         */
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }
}
