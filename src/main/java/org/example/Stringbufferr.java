package org.example;

public class Stringbufferr {
    public static void main(String[] args) {
        //mutable
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" world");
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
    sb.setCharAt(4,'o');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    sb.delete(0,sb.length());
        System.out.println("Empty seq: "+sb);

    }
}
