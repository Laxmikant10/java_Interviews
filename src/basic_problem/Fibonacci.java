package src.basic_problem;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 1; i < 10; i++) { //0 1 1 2 3 5 8 13
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
