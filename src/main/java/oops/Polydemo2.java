package oops;

public class Polydemo2 {//constructor overloading
    public Polydemo2(){

    }
    public Polydemo2(int x, int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public Polydemo2(int x, int y,int z){
        int sum=x+y+z;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Polydemo2 p = new Polydemo2(2,3);
    }
}
