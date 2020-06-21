package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.DateFormat:是日期/时间格式化子类的抽象类
 *  作用：格式化（也就是日期->文本）、解析（文本->日期）
 *  成员方法：
 *      String format(Date date): 按照指定的模式，把Date日期，格式化为符合模式的字符串
 *      Date prase(String source):把符合模式的字符串，解析为Date日期
 *
 *  DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
 *
 *  java.text.SimpleDateFormat extends DateFormat
 *  构造方法;
 *      SimpleDateFormat(String pattern):用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
 *      参数：
 *          String pattern:传递指定的模式
 *      模式：区分大小写的
 *      y: 年
 *      M：月
 *      d：日
 *      H：时
 *      m：分
 *      s：秒
 *      写对应的模式，会把模式替换为对应的日期和时间：
 *          "yyyy-MM-dd HH:mm:ss"
 *          "yyyy年MM月dd日 HH时mm分ss秒"
 *          注意：符号不能变
 *
 */
public class Demo01DateFromat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /**
     * 使用DateFormat类中的方法parse，把文本解析为日期
     * Date prase(String source):把符合模式的字符串，解析为Date日期
     * 使用步骤：
     *      1.创建SimpleDateFormat对象，构造方法中传递指定的模式
     *      2.2.调用SimpleDateFormat对象的parse方法，按照构造方法中指定的模式，将字符串格式为Date日期对象
     *
     * 注意：
     *      public Date parse(String source) throws ParseException
     *      parse方法声明了一个异常叫做ParseException解析异常
     *      如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常
     *
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2088年08月08日 17时01分10秒");
        System.out.println(date); // Sun Aug 08 17:01:10 CST 2088
    }

    /**
     * 使用DateFormat类中的方法format，把日期格式为文本
     * String format(Date date): 按照指定的模式，把Date日期，格式化为符合模式的字符串
     * 使用步骤：
     *      1.创建SimpleDateFormat对象，构造方法中传递指定的模式
     *      2.调用SimpleDateFormat对象的format方法，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串
     */
    private static void demo01() {

        // 1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //  2.调用SimpleDateFormat对象，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串
        String text = sdf.format(date);

        System.out.println(date); // Sun Jun 21 23:32:44 CST 2020
        System.out.println(text); // 2020-06-21 23:32:44
    }
}
