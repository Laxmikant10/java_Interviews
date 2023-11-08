package src.ust.staticExample;

public class TestStaticMethods {

    public static void main(String[] args) {
        StaticExample_1 staticExample1 = new StaticExample_1();
        staticExample1.m1("will Call StaticExample_1 m1");


        StaticExample_2 staticExample2 = new StaticExample_2();
        staticExample2.m1("will Call StaticExample_2 m1");

        StaticExample_1 staticExample12 = new StaticExample_2();
        staticExample12.m1("will Call StaticExample_2 m1");

    }
}
