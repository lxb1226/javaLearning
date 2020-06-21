package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习题：
 *      请使用日期时间相关的API，计算一个人已经出生了多少天
 * 分析：
 *
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式为：yyyy-MM-dd");
        String birthdayString = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);
        long birthdayDateTime = birthdayDate.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        System.out.println(time / 1000 / 60 / 24 / 60);

    }
}
