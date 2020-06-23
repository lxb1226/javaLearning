package com.itheima.demo02.Recursion;

public class Demo03Recurison {
    public static void main(String[] args) {
        int s = jc(5);
        System.out.println(s);
    }

    public static int jc(int n){
        if(n == 1)
            return 1;
        return n * jc(n-1);
    }
}
