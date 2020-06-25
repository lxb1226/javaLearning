package com.itcast.annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    框架类
 */

@Pro(className = "com.itcast.annotation.Demo01", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
       /*
        前提，不改变该类的任何代码，
        */

        // 1解析注解
        // 1.1 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // 1.2 获取上边的注解对象
        // 其实就是在内存中生成了一个该注解接口的子类实现对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        // 1.3 调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        // 3.加载类进内存
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

    }
}
