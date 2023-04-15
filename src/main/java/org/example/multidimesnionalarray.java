package org.example;

public class multidimesnionalarray {
    public static void main(String[] args) {
        int marks[][]={
                {23,45,56,78,89},
                {34,56,78,98,56},
                {45,65,76,98,54}
        };//3*5
        int arr2[][]=new int[5][2];

        System.out.println(marks[0][0]);

        for (int i=0; i<3; i++) {
            for (int j=0;j<5;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
