package com.itheima.demo03.Generic.demo04;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class Test {
    public static void main(String[] args) {
        // 1.准备牌
        // 定义一个存储54张牌的ArrayList的集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        // 定义两个数组，一个存储牌的颜色，一个存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");

        // 组装52张牌
        for(String number: numbers){
            for(String color: colors){
//                System.out.println(color+number);
                poker.add(color+number);
            }
        }
//        System.out.println(poker);

        /*
        2.洗牌
         */
        Collections.shuffle(poker);

        /*
        3.发牌
         */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3发给3个玩家轮流发牌
            剩余3张牌给底牌
         */
        for(int i = 0; i < poker.size(); i++){
            String p = poker.get(i);
            if(i >= 51){
                // 给底牌发牌
                diPai.add(p);
            }else if(i % 3 == 0){
                player01.add(p);
            }else if(i % 3 == 1){
                player02.add(p);
            }else if(i % 3 == 2){
                player03.add(p);
            }
        }
        System.out.println("刘德华:" + player01);
        System.out.println("周润发:" + player02);
        System.out.println("周星驰:" + player03);
        System.out.println("底牌:" + diPai);

    }
}
