package com.itheima.demo05.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳研", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 19),
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 使用Lambda表达式
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        Arrays.sort(arr, (o1, o2) ->
                o1.getAge() - o2.getAge()
        );

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
