package oops;

public class Childclass extends Superclass {
    int num=35;
    public void display(){
        super.interestrate=4.5;
        System.out.println(super.num);
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        Childclass child = new Childclass();
    }
}
