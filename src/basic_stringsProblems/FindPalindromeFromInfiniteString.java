package src.basic_stringsProblems;

import java.util.Arrays;

public class FindPalindromeFromInfiniteString {
    public static void main(String[] args) {

        //1. check palindrome word in to the given string
        //String str = "...madam....";
        String str = "nsndasdnadnanda..madam..naskdkhakjdnkjanhcanckje";

        //nsndasdnadnanda..madam..naskdkhakjdnkjanhcanckje

        /*boolean b = checkPalindrome(str);
        System.out.println("b = " + b);*/

        boolean found = infiniteString(str);
        System.out.println("found = " + found);

    }

    private static boolean infiniteString(String str) {
        for(int i = 0; i< str.length(); i++){
            String substring = str.substring(i, i + 5);
            if(checkPalindrome(substring)){
                System.out.println("substring = " + substring);
                return true;
            }
        }
        return false;
    }

    private static boolean checkPalindrome(String str) {
        boolean flag =true;
        for(int i = 0; i< str.length()/2; i++){

            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}

