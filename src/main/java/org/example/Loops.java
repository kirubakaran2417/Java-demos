package org.example;

public class Loops {
    public static void main(String[] args) {
        /*
        while
        do while
        for
         */
        int i = 6;
        int j = 6;
        while(i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("============bottom up=====================");
        do{
            System.out.println(j);
            j++;
        }while(j<5);
        System.out.println("===============for loop===================");
        for (int k=0; k<5;k++){
            System.out.println(k);
        }
    }
}
