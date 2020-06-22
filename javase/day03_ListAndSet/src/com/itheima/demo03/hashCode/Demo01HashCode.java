package com.itheima.demo03.hashCode;

/*
    哈希值：是一个十进制的整数，由系统碎金各处
    在Object类中有一个方法，可以获取对象的哈希值
    public native int hashCode();
    native:代表该方法调用的是本地操作系统的方法。


 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person p = new Person();
        int h1 = p.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
         */
        System.out.println(p);
        System.out.println(p2);
    }
}
