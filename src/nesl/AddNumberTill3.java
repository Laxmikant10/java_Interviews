package src.nesl;

import java.util.Scanner;
//Add a number till 3 or given number
//ex - 75 is the number then print 76,77,78.
public class AddNumberTill3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();

        int sum =0;

        for(int i=1;i<=3;i++){
            sum = num+i;
            System.out.println("sum = " + sum);
        }

    }
}
