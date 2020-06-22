package com.itheima.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try...catch:异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(){
          异常的处理逻辑，异常对象之后，怎么处理异常对象
           一般在工作中，会把异常的信息记录到一个日志中
        }catch(异常类名 变量名){
        }
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
            如果try没有产生异常，那么就不会执行catch

 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("catch--传递的文件后缀不是.txt");
            /*
            Throwable类中定义了3个异常处理方法
                `public String getMessage()`:获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
                `public String toString()`:获取异常的类型和异常描述信息(不用)。
                `public void printStackTrace()`:打印异常的跟踪栈信息并输出到控制台。
             */
            System.out.println(e.getMessage()); // 文件的后缀名不对
            System.out.println(e.toString()); // java.io.IOException: 文件的后缀名不对
            e.printStackTrace();
            /*
            java.io.IOException: 文件的后缀名不对
	            at com.itheima.demo02.Exception.Demo01TryCatch.readFile(Demo01TryCatch.java:50)
	            at com.itheima.demo02.Exception.Demo01TryCatch.main(Demo01TryCatch.java:25)
             */
        }

        System.out.println("后续代码");
    }

    public static void readFile(String filename) throws IOException {
        /*
        如果传递的路径不是.txt结果
        那么就跑出IO异常对象
         */

        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题， 读取文件");
    }
}

