package com.itheima.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();

        // 不写泛型默认是Object类型
//        gc.setName("只能是字符串");
//        System.out.println(gc.getName());

        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(1);

        Integer name = gc1.getName();
        System.out.println(name);
    }
}
