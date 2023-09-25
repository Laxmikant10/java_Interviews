package src.basic_stringsProblems;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";

        palindrome_usingStringBufferReverseMethod(str);

        palindrome_usingForLoopBruteForceSolution(str);

    }

    private static void palindrome_usingStringBufferReverseMethod(String str) {
        StringBuffer stringBuffer = new StringBuffer(str).reverse();
        System.out.println("palindrome_usingStringBufferReverseMethod-->");
        if (stringBuffer.toString().equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is NOT palindrome");

        }
    }

    private static void palindrome_usingForLoopBruteForceSolution(String s) {
        char[] charArray = s.toCharArray();

        char[] newCharArray = new char[charArray.length];

        int count = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            newCharArray[count] = charArray[i];
            count++;
        }
        System.out.println("palindrome_usingForLoopBruteForceSolution-->");
        System.out.println("charArray => " + Arrays.toString(charArray));
        System.out.println("newCharArray => " + Arrays.toString(newCharArray));

        if (Arrays.toString(charArray).equals(Arrays.toString(newCharArray))) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is NOT palindrome");
        }
    }
}
