package src.array_problems;

import java.util.HashMap;
import java.util.Map;

public class LargestLengthSubArrayWithSumZero {

    private static int largestSubArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int largestSubArrayLength = 0;
        int length;

        //to handle special case
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (map.containsKey(currentSum)) {
                length = i - map.get(currentSum);
                largestSubArrayLength = Math.max(length, largestSubArrayLength);

            } else {
                map.put(currentSum, i);
            }
        }
        return largestSubArrayLength;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};
        int[] arr = {15, -2, 2, -8, 1, 7, -10, 23};

        int largestSubArrayLength = largestSubArray(arr);
        System.out.println("largestSubArrayLength = " + largestSubArrayLength);
    }


}
