package src.basic_stringsProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";

        palindrome_usingStringBufferReverseMethod(str);

        palindrome_usingForLoopBruteForceSolution(str);

        //Efficient way with ForLoop
        palindrome_usingForLoop(str);

        palindrome_usingJava8(str);

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


    private static void palindrome_usingForLoop(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) //madam
        {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(str+": Is Palindrome");
        }else {
            System.out.println(str+": Is Not Palindrome");

        }
    }

    private static void palindrome_usingJava8(String str) {

        boolean palindrome = IntStream.range(0, str.length() / 2)
                .noneMatch(value -> str.charAt(value) != str.charAt(str.length() - value - 1));

        if(palindrome){
            System.out.println(str+": Is Palindrome");
        }else {
            System.out.println(str+": Is Not Palindrome");

        }
    }
}
