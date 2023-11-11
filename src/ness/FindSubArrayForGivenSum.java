package src.ness;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted array and a integer sum value.
 * Find subarray who sum is given
 * Ex1:
 * Input:
 * Array [1,3,6,8,15]
 * Sum : 14
 * Output: = 6,8
 * Ex2:
 * Array [1,3,6,8,15]
 * Sum : 10
 * Output : 1,3,6
 */
public class FindSubArrayForGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 15};
        int sum = 14;

        //O(N) --> time complexity
        int[] pairs = findPairs(arr, sum);
        System.out.println("pairs = " + Arrays.toString(pairs));

        //O(N^2) --> time complexity
        int[] pairsBruteForceSolution = findPairs_BruteForceSolution(arr, sum);
        System.out.println("pairsBruteForceSolution = " + Arrays.toString(pairsBruteForceSolution));
    }

    private static int[] findPairs(int[] arr, int sum) {
        int[] array = new int[0];
        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int start_index;
        int end_index;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];

            if (currentSum == sum) {
                start_index = 0;
                end_index = i;
                return Arrays.copyOfRange(arr, start_index, end_index + 1);
            }

            if (map.containsKey(currentSum - sum)) {
                start_index = map.get(currentSum - sum) + 1;
                end_index = i;
                //System.out.println(start_index +":"+end_index);
                return Arrays.copyOfRange(arr, start_index, end_index + 1);
            }
            map.put(currentSum, i);
        }
        return array;
    }


    public static int[] findPairs_BruteForceSolution(int[] arr, int sum) {//1,3,6,8,15

        int[] array = new int[0];
        int START_INDEX;
        int END_INDEX;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println("Sum start index & end: " + i);
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    currentSum += arr[j];
                    if (currentSum == sum) {
                        START_INDEX = i;
                        //System.out.println("Start_index:-"+i + " = " + arr[i]);
                        END_INDEX = j;
                        //System.out.println("End_index:-"+j + " = " + arr[j]);
                        array = Arrays.copyOfRange(arr, START_INDEX, END_INDEX + 1);
                        return array;
                    }
                }
            }
        }
        return array;
    }
}
