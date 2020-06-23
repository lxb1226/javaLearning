package com.itheima.demo04.ObjectStream;

import java.io.Serializable;

/*
    要序列化或反序列化要实现Serializable

    static关键字：静态关键字
        静态优先于非静态加载到内存中（静态优先于对象进入到内存中）
        被static修饰的成员变量不能被序列化，序列化的都是对象

    transient:瞬态关键字
        被transient修饰的成员变量，不能被序列化
 */
public class Person implements Serializable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
