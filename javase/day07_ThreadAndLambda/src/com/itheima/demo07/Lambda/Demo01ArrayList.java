package com.itheima.demo07.Lambda;

import java.util.ArrayList;

/*
    Lambda表达式可推导，可省略
    凡是根据上下文内容推导出来的内容，都可以省略书写
    可以省略的内容
        1.（参数列表）：括号中参数列表的数据类型，可以省略不写
        2.（参数列表）：括号中的参数如果只有一个，那么类型和()都可以省略
        3.{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略({},return,分号)
            注意：要省略{},reutrn,分号必须一起省略
 */
public class Demo01ArrayList {
    ArrayList<String> list01 = new ArrayList<>();

}
