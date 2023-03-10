package org.example;

public class Loops2 {
    public static void main(String[] args) {

//        System.out.println("===============for loop===================");
//        for (int i=0; i<5;i++){
//            System.out.print(i+"\t");
//        }

        for(int i=1;i<=3;i++){//outer loop
            System.out.println("Im week "+i);
            for (int j=1;j<=4;j++){//inner loop
                System.out.println("Im day "+j);
            }
        }
    }
}
