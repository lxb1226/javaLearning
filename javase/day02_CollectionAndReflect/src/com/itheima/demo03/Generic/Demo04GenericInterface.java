package com.itheima.demo03.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1= new GenericInterfaceImpl1();
        gi1.method("GenericInterfaceImpl1");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(12.0);
    }
}
