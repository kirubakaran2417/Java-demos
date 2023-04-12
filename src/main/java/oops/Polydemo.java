package oops;

public class Polydemo {//method overloading
    public int add(int x, int y){
        return x+y;
    }
    public double add(int x, double y){
        return x+y;
    }
    public int add(int x, int y,int z){
        return x+y+z;
    }
    public double add(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        Polydemo demo = new Polydemo();
        demo.add(2.0,3.0);
        demo.add(2,3.5);
    }
}
