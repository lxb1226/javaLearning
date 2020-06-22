package com.itheima.demo01.Exception;

/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因")
    注意：
        1.必须写在方法的内部
        2.后边new的对象必须是Exception或者是Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不处理，默认交给JVM处理
            throw关键字后边创建的是编译异常，我们就必须处理这个异常，要么throws,要么try...catch
 */
public class Demo03Throw {

    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index){
        /*
            对传递过来的参数数组，进行合法性校验
            如果数组arr是null
            那么就抛出空指针异常，告知方法的调用者传递的数组的值是null
            注意：NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理。
                ArrayIndexOutOfBoundsException也是运行期异常。
         */
        if(arr == null){
            throw new NullPointerException("传递的数组的值是null");
        }
        /*
            对传递过来的参数index进行合法性校验
            如果index的范围不在数组的索引范围内
            那么就抛出数组索引越界异常，告知方法的调用者“传递的索引超过了数组的使用范围”
         */
        if(index < 0 || index > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超过了数组的使用范围");
        }
        return arr[index];
    }
}
