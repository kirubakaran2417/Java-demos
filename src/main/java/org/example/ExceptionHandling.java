package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("test 1");
        System.out.println("test 2");
        System.out.println("test 3");
        System.out.println("test 4");
        try{
            int[] c = {2, 3, 4, 5, 6};
            System.out.println(c[5]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("please provide valid index");
        }finally{

        }
        System.out.println("test 5");
        System.out.println("test 6");
        System.out.println("test 7");
        System.out.println("test 8");
        System.out.println("test 9");

        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
