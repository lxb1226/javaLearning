package com.itheima.demo01.Exception;


/*
    异常的产生过程解析（分析异常是怎么产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3); // java.lang.ArrayIndexOutOfBoundsException: 3
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index){
        return arr[index];
    }
}
