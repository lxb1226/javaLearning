package com.itcast.reflect;

import com.itcast.domain.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, IOException {
        // 可以创建任意类的对象，可以执行任意方法

//        Person p = new Person();
//        p.eat();

        // 1.加载配置文件
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2加载配置文件，转换为一个集合
        // 1.2.1获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 3.加载类进内存
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
