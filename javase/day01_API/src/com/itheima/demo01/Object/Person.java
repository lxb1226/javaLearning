package com.itheima.demo01.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    直接打印对象的地址值没有意义，需要重写Object类的toString方法
    打印对象的属性
     */
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /**
     * Object类的equals方法默认比较的是两个对象的地址值，没有意义
     * 所以需要重写equals方法，比较两个对象的属性值
     * 隐含着多态：
     * 多态弊端：无法使用子类特有的内容（属性，方法）
     * 解决：可以使用向下转型（强转）把Object类型转换为Person
     */
//    @Override
//    public boolean equals(Object obj) {
//        // 增加判断，传递的参数obj是this本身，直接返回true，提高程序效率
//        if(this == obj)
//            return true;
//
//        // 增加判断，传递的参数obj是null，直接返回false，提高程序的效率
//        if(obj == null)
//            return false;
//
//        /**
//         * 增加一个判断，是Person类型在转换，防止类型转换异常ClassCastException
//         */
//        if(obj instanceof Person){
//            // 向下转型
//            Person p = (Person) obj;
//            // 比较两个对象的属性：一个时调用方法的this，一个就是p
//            boolean b =  this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//
//        return false;
//
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术，判断o是否为Person类型，等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
