package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

/*
    练习：
        计算一个字符串每个字符出现次数

 */
public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            }else{
                map.put(c, 1);
            }
        }

        for(Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
