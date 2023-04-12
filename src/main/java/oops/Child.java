package oops;

public class Child extends Parent{
    int a=25;

    public void display(){
        super.display();
        System.out.println("Im child class method: " + a);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
