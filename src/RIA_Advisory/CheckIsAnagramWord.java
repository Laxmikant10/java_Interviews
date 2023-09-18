package src.RIA_Advisory;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIsAnagramWord {
    public static void main(String[] args) {
        /*String a = "silent";
        String b = "listen";*/

        System.out.println("Check if given two Strings are anagram or not -->");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st word");
        String a = sc.nextLine();

        System.out.println("Enter 2nd word");
        String b = sc.nextLine();


        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();

        Arrays.sort(aCharArray);
        Arrays.sort(bCharArray);

        String sortedA = new String(aCharArray);
        String sortedB = new String(bCharArray);

        if (sortedA.equals(sortedB))
            System.out.println("Its a Anagram Word");
        else
            System.out.println("Not a Anagram Word");

    }

}
