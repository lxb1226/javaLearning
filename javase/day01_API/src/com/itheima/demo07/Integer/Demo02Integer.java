package com.itheima.demo07.Integer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 自动装箱和自动拆箱：
 *      基本类型的数据和包装类之间可以自动的相互转换
 *      JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /**
         * 自动装箱：直接把int类型的整数赋给包装类
         * 相当于 Integer in = new Integer(1);
         */
        Integer in = 1;

        /**
         * 自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型的数据，再参与计算
         * in + 2;就相当于in.inValue() + 3 = 3;
         */
        in = in + 2;
        System.out.println(in);

        // ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

    }
}
