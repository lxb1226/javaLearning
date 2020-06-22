package com.itheima.demo01.Exception;


import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类时java语言所有错误或异常的超类
        Exception:编译期异常，进行编译java程序出现的问题
            RuntimeException:运行期异常，java程序运行过程中出现的问题
        Error：错误
            必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {

        // Exception:编译期异常，进行编译java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 用来格式化日期

        Date date = null;
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        //             RuntimeException:运行期异常，java程序运行过程中出现的问题
        int[] arr = {1,2 ,3};
        try {
            // 可能出现异常的代码
            System.out.println(arr[3]);
        } catch (Exception e) {
            // 异常的处理逻辑
            e.printStackTrace();
        }
        System.out.println("后续代码");


    }
}
