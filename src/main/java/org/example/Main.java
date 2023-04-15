package org.example;

public class Main {

    public static void main(String[] args) {

        Methods m=new Methods();//non primitive data types
        System.out.println(m.add());
        System.out.println(m.subtract());

        Methods2 m2=new Methods2();//non primitive data types
        Methods2 m3=new Methods2();
        Methods2 m4=new Methods2();
        Methods2 m5=new Methods2();
        m2.add(23,35);//arguments
        m2.subtract(55,22);
    }
}
