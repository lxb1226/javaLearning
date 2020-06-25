package com.itcast.reflect;

import com.itcast.domain.Person;

import java.lang.reflect.Field;

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
public class ReflectDemo02 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        // * Field[] getFields() ：获取所有public修饰的成员变量
        for(Field field : fields){
            System.out.println(field);
        }

        // Field getField(String name)   获取指定名称的 public修饰的成员变量
        System.out.println("-------------");
        Field a = personClass.getField("a");
        System.out.println(a);
        // 获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        // 设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("-----------------------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field field: declaredFields){
            System.out.println(field);
        }


        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
