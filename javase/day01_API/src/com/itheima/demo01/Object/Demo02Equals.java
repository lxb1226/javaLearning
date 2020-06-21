package com.itheima.demo01.Object;

public class Demo02Equals {
    public static void main(String[] args) {
        /**
         * Person类默认继承了Object类，所以可以使用Object类的equals方法
         * Object类equals方法的源码：
         * public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         *     ==运算符
         *     基本数据类型：比较的是值
         *     引用数据类型：比较的是两个对象的地址值
         */

        Person p1 = new Person("迪丽热巴", 18);
        Person p3 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎", 18);

        System.out.println("p1:" + p1); // p1:com.itheima.demo01.Object.Person@1b6d3586
        System.out.println("p2:" + p2); // p2:com.itheima.demo01.Object.Person@4554617c
        System.out.println("p2:" + p3); // p2:com.itheima.demo01.Object.Person@4554617c

        boolean b = p1.equals(p2);
        boolean b1 = p1.equals(p3);

        System.out.println(b);
        System.out.println(b1);
    }
}
