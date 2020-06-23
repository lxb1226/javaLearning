package com.itheima.demo06.Lambda;

public class Demo01Calcalator {
    public static void main(String[] args) {
        // 调用invokeCalc方法
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // 使用Lambda表示式
        invokeCalc(101, 20, (int a, int b) -> {
            return a + b;
        });

        // 使用Lambda表示式
        invokeCalc(101, 20, (a, b) ->
                a + b
        );

    }

    // 定义一个方法，参数传递两个int的整数，参数传递Calculator接口，方法内部调用Calculator中的方法calc计算两个整数的和
    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
