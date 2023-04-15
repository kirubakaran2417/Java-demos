package org.example;

public class Arraysdemo {
    public static void main(String[] args) {
        int mark1=89;
        int mark2=56;
        int mark3=78;
        int mark4=90;
        int mark5=88;

        //declare arrays
        int[] arr;
        //initialize
        arr=new int[5];
        //ho to add elements
        arr[0]=89;
        arr[1]=56;
        arr[2]=78;
        arr[3]=90;
        arr[4]=88;
        //creation
        String[] names = {"karthi","kiruba","sri","anna"};
        //aceessing
        //System.out.println(names[0]);
        //iterating
        names[0]="vignesh";
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        //enhanced for loop(for each)
        for (String i : names) {
            System.out.println(i);
        }



        }


    }

