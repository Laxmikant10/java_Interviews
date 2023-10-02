package src.basic_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Nth Prime Number from 1 to 1000");
        int nthNumber = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int value = nthPrimeNumber(nthNumber, list);
        System.out.println("nth Number Prime Number :" + value);

    }

    private static int nthPrimeNumber(int nthNumber, List<Integer> list) {
        int indexNumber = nthNumber - 1;
        for (int i = 2; i < 1000; i++) {
            primeNumber(i, list);
        }
        return list.get(indexNumber);
    }

    public static void primeNumber(int num, List<Integer> list) {
        int count = 0;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count <= 0) {
            list.add(num);
        }
    }
}
