package org.example;

public class Methods {
    int a=24;//global variables or instance variables
    int bb=35;
    public int add(){
        int a=22;
        int b=33;
        int c=this.a+bb;//local variables
        return c;
    }
    public int subtract(){
        int d=a-bb;
        return d;
    }

}
