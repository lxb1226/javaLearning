package com.itcast.reflect;

import com.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * * Class对象功能：
 * 	* 获取功能：
 * 		1. 获取成员变量们
 * 			* Field[] getFields() ：获取所有public修饰的成员变量
 * 			* Field getField(String name)   获取指定名称的 public修饰的成员变量
 *
 * 			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
 * 			* Field getDeclaredField(String name)
 * 		    * setAccessible() 暴力反射
 * 		2. 获取构造方法们
 * 			* Constructor<?>[] getConstructors()
 * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * 			* Constructor<?>[] getDeclaredConstructors()
 * 		3. 获取成员方法们：
 * 			* Method[] getMethods()
 * 			* Method getMethod(String name, 类<?>... parameterTypes)
 *
 * 			* Method[] getDeclaredMethods()
 * 			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 * 		4. 获取全类名
 * 			* String getName()
 */
public class ReflectDemo04 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;

        // 获取方法
        Method eat_method = personClass.getMethod("eat");
        // 执行方法
        Person p = new Person();
        eat_method.invoke(p);

        //
        Method eat_method1 = personClass.getMethod("eat", String.class);
        // 执行方法
        Person p1 = new Person();
        eat_method1.invoke(p1, "饭");

        // 获取所有public修饰的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for(Method method: declaredMethods){
            System.out.println(method);
            System.out.println(method.getName());
        }
        // 获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
