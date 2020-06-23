package com.itheima.demo07.Prop;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    `java.util.Properties ` 继承于` Hashtable` ，来表示一个持久的属性集。它使用键值结构存储数据，每个键及其对应值都是一个字符串。该类也被许多Java类使用，比如获取系统属性时，`System.getProperties` 方法就是返回一个`Properties`对象。
    Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
    属性列表中每个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串

        - `public Object setProperty(String key, String value)` ： 保存一对属性。
        - `public String getProperty(String key) ` ：使用此属性列表中指定的键搜索属性值。
        - `public Set<String> stringPropertyNames() ` ：所有键的名称的集合。
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
//        show02();
//        show01();
    }

    /*
        void load(InputStream inStream)
        void load(Reader reader)

        注意：
            1.存储键值对的文件中，键与值默认的连接符号可以使用=，空格，
            2.存储键值对的文件中，可以使用=进行主食
            3.存储键值对的文件中，键与值默认都是字符串，不用加引号
     */
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("day09_IOAndOutputStream\\\\prop.txt"));
        Set<String> set = prop.stringPropertyNames();
        for(String key:set){
            String value = prop.getProperty(key);
            System.out.println(key + "-->" + value);
        }
    }

    /*
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream out:字节输出流，不能写入中文
            Writer writer：字符输出流，中文
            String comments:主食，用来解释说明保存的文件是做什么的，不能写中文
     */
    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

//        FileWriter fw = new FileWriter("day09_IOAndOutputStream\\prop.txt");
//        prop.store(fw, "save data");
//        fw.close();
        prop.store(new FileOutputStream("day09_IOAndOutputStream\\prop2.txt"), "");
    }

    public static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

        Set<String> set = prop.stringPropertyNames();
        for(String key:set){
            String value = prop.getProperty(key);
            System.out.println(key + "-->" + value);
        }
    }
}
