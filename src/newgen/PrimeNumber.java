package src.newgen;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        isPrimeNumber(num);

        System.out.println("---------------------------------");

        System.out.println("Print prime number from 1 to 100");
        //Print prime number from 1 to 100
        for (int i = 2; i < 100; i++) {
            isPrimeNumber(i);
        }
    }

    private static void isPrimeNumber(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("number is not prime");
        } else {
            System.out.println(num + " : -> number is prime");
        }
    }
}
