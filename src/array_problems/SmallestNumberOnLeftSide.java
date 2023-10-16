package src.array_problems;

import java.util.Stack;

/**
 * Input:  arr[] = {1, 6, 4, 10, 2, 5}
 * Output:   {_, 1, 1,  4, 1, 2}
 *
 * Input: arr[] = {1, 3, 0, 2, 5}
 * Output:        {_, 1, _, 0, 2}
 */
public class SmallestNumberOnLeftSide {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        //int[] arr = {1, 3, 0, 2, 5};
        previousSmallestNumber(arr);
    }

    public static void previousSmallestNumber(int[] arr) {
        Stack<Integer> integerStack = new Stack<>();
        // Traverse all array elements
        for (int i = 0; i < arr.length; i++) {

            while (!integerStack.isEmpty() && integerStack.peek() >= arr[i]) {
                integerStack.pop();
            }
            // If all elements in Stack were greater than arr[i]
            if (integerStack.empty()) {
                System.out.print("_, ");
            } else {//Else print the smaller elements
                System.out.print(integerStack.peek() + ", ");
            }
            integerStack.push(arr[i]);
        }

    }
}
