package oops;

public class Subclass extends Baseclass{
    public void add(){
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Subclass a = new Subclass();
        a.add();
    }
}
