package com.itheima.demo03.Exception;

// 如果finally里有return，那么结果永远返回finally里的结果
public class Demo02Exception {

    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(a);
        }finally {
         a = 100;
         return a;
        }
    }
}
