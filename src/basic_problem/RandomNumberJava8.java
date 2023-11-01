package src.basic_problem;

import java.util.Random;

public class RandomNumberJava8 {
    public static void main(String[] args) {
        Random random = new Random();

       // System.out.println(random.nextInt(100));

        random.ints(1,100).limit(10).sorted().forEach(System.out::println);
    }
}
