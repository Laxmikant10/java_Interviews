package src.java8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        boolean checkIsPrime = checkIsPrime(num);
        System.out.println("Number is Prime : " + checkIsPrime);
    }

    private static boolean checkIsPrime(int num) {

        //return num > 1 && !IntStream.rangeClosed(2, num / 2).anyMatch(value -> num % value == 0);
        return num > 1 && IntStream.rangeClosed(2, num / 2).peek(System.out::println).noneMatch(value -> num % value == 0);
    }
}
