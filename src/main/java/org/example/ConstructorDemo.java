package org.example;

public class ConstructorDemo {
    /*
    constructor is same like method which is not having return and it should
    have same name as class name
     */
   String name;

   public ConstructorDemo(String name){
       this.name=name;
   }

    public void testConstructor(){
        System.out.println(name);
    }
}
