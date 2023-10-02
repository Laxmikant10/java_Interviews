package src.basic_problem;

import java.util.Scanner;

public class IntPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to Check Palindrome");
        int num = sc.nextInt();

        checkPrimeNumber(num);
    }

    private static void checkPrimeNumber(int num) {

        int temp = num;
        int r;
        int sum = 0;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number");
        else
            System.out.println("Not A palindrome number");
    }
}
