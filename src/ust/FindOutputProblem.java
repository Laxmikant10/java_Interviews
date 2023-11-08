package src.ust;

public class FindOutputProblem {

    public void m1(String s) {
        System.out.println("String method");
    }

    /*public void m1(StringBuilder s) {
        System.out.println("StringBuilder method");
    }*/

    public void m1(Object o) {
        System.out.println("object method");
    }

    public static void main(String[] args) {
        FindOutputProblem t = new FindOutputProblem();
        t.m1("test");
        t.m1(new FindOutputProblem());
        t.m1(null);
    }
}
