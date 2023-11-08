package src.ust;

public class SingletonClassTest {

    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.singleton;

        obj1.m1();

        SingletonClass obj2 = SingletonClass.singleton;

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
