package org.example;

import java.util.Scanner;

public class Arrays3demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the value of a[" + i + "]");
            a[i] = s.nextInt();
        }
        int largest = a[0];
        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
            if (a[i] < smallest)
                smallest = a[i];
        }

        System.out.println("largest: " + largest);
        System.out.println("smallest: "+smallest);
    }
}