package src.epam;

import java.util.HashMap;
import java.util.Map;

//Given an array of positive and negative numbers, the task is to
// find if there is a subarray (of size at least one) with 0 sum
public class SubArraySumZero {
    public static void main(String[] args) {
        //TODO
        int[] array = {15, -2, 2, -8, 1, 7, -10, 23};
        //int[] array = {15, 2, 2, -8, 1, 7, 10, 23};
        int max_sum = 0;

        boolean b = checkSubArrayWithSumZero(array, max_sum);
        System.out.println("Sub Array with At least 0 sum Available = " + b);
    }

    private static boolean checkSubArrayWithSumZero(int[] array, int maxSum) {
        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (map.containsKey(currentSum)) {
                return true;
            } else {
                map.put(currentSum, i);
            }
        }
        return false;
    }
}
