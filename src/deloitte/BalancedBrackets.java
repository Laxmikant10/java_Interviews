package src.deloitte;

import java.util.Scanner;
import java.util.Stack;

//Balanced Brackets in an expression in javaBalanced Brackets in an expression in java
//Parenthesis Checker | Valid Parentheses Leetcode | Balanced Parentheses Hackerrank
public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any type of Brackets");
        String brackets = sc.nextLine();

        boolean parenthesisMatching = BalancedBrackets.checkParenthesisMatching(brackets);

        System.out.println("parenthesisMatching = " + parenthesisMatching);
    }

    public static boolean checkParenthesisMatching(String str) {
        //Stack => First In First Out(FIFO)
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isOpening(ch)) {
                characterStack.push(ch);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                } else if (!isMatchingClosedBracket(characterStack.peek(), ch)) {
                    //peek() method used to get first element in stack
                    return false;
                } else {
                    characterStack.pop();
                }
            }
        }
        return characterStack.isEmpty();
    }

    private static boolean isMatchingClosedBracket(Character peek, char ch) {
        return (peek == '(' && ch == ')') ||
                (peek == '{' && ch == '}') ||
                (peek == '[' && ch == ']');
    }

    private static boolean isOpening(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
}
