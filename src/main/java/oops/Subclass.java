package oops;
//method overriding
public class Subclass extends Baseclass{
    public void display(){
        super.display();
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Subclass a = new Subclass();
        a.display();
    }
}
