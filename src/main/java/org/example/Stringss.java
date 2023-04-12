package org.example;

public class Stringss {

    public static void main(String[] args) {
        //immutable
        String name="sritharan";//using literal
        System.out.println(name.length());
        System.out.println(name.substring(0,3));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('i'));
        System.out.println(name.concat(" uruthiran"));
        System.out.println(name.contains("t"));
        System.out.println(name.replace("t","d"));
        System.out.println();
    }
}
