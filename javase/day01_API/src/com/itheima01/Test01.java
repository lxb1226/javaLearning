package com.itheima01;

public class Test01 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        Student s = new Student("张三", 23);
        System.out.println(s); // com.itheima01.Student@1b6d3586 重写toString方法后 Student{name='张三', age=23}
        System.out.println(s.toString()); // com.itheima01.Student@1b6d3586
    }
}
