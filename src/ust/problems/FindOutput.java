package src.ust.problems;

public class FindOutput {

    public void m1(int i) {
        System.out.println("int method");
    }

    public void m1(float f) {
        System.out.println("float method");
    }

    public static void main(String[] args) {
        FindOutput t = new FindOutput();
        t.m1(10);
        t.m1(0.5f);
         //t.m1(0.5); Exception will occured
    }
}
