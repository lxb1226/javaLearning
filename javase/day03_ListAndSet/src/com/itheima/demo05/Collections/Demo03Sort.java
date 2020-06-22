package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
`public static <T> void sort(List<T> list，Comparator<? super T> )`

    Comparator和Comparable的区别
        Comparable：自己和别人比较，自己需要实现Comparable接口，重写ComparaTo方法
        Comparator：相当于找一个第三方的裁判，比较两个
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 2);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 升序
                return o2 - o1; // 降序
            }
        });

        System.out.println(list);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("迪丽热巴", 18));
        list02.add(new Student("古力娜扎", 20));
        list02.add(new Student("杨幂", 17));

        System.out.println(list02);


        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
