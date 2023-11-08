package src.ust;

public class SingletonClass {

    static int x =10;
    static SingletonClass singleton = new SingletonClass();

    private SingletonClass(){
        System.out.println("Private Constructor");
    }

    public void m1(){
        System.out.println("m1 method");
    }
}
