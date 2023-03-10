package org.example;

public class ControlStatements {
    /*
    operators
    Arithmetic= +,-,*,/,%
    Relational= >,>=,<=,>,==,!=
    Logical= &&,||,!
    unary=++,--
    Assignment--> =

     */

    public static void main(String[] args) {
        int tamil=90;
        int english=89;
        int maths=87;
        int science=88;
        int social=87;

        double total=tamil+english+maths+science+social;

        double avg=total/5;

        System.out.println("The average is: "+avg);

        if(avg>80){
            System.out.println("First class");
        }else if(avg>60){
            System.out.println("Second class");
        }else if(avg>40){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


    }
}
