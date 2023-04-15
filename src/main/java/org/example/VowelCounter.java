package org.example;

import java.util.Scanner;
public class VowelCounter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = input.nextLine();

            int count = 0;
            System.out.print("Vowels: ");
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                    System.out.print(ch + " ");
                }
            }
            System.out.println("\nNumber of vowels: " + count);
        }
    }


