package com.itheima.demo04.Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        // 调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        invokeCook(()->{
            System.out.println("吃饭了");
        });

        invokeCook(()->
            System.out.println("吃饭了")
        );
    }

    // 定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
