package com.itheima.demo04.MyException;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册

 */
public class Demo01RegisterException {
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名");
        String username = sc.next();
        checkUsername(username);

    }

    public static void checkUsername(String username){
        for(String name: usernames){
            if(name.equals(username)){
                try {
                    throw new RegisterException("该用户已经被注册了");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return; // 结束方法
                }
            }
        }
        System.out.println("恭喜你，注册成功");
    }
}
