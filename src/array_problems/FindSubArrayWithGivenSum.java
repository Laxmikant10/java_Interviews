package src.array_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
This code is valid only for consecutive array and for non-consecutive(without sorted approach) refer mastercard code for betterment
 */
public class FindSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] array = {10, 15, -5, 15, -10, 5};
        int sum = 5;
        /*int[] array = {0, -1, 2, -3, 1};
        int sum = -2;*/

        //O(N) --> time complexity
        int[] pairs = findPairs(array, sum);
        System.out.println("pairs = " + Arrays.toString(pairs));

        //Pointer Approach(for performing this operation need to sort Element in Ascending order)
        // --> O(NlogN), Time complexity for sorting the array
        String pointerApproach = findPairs_PointerApproach(array, sum);
        System.out.println("pointerApproach = " + pointerApproach);

        //O(N^2) --> time complexity
        int[] pairsBruteForceSolution = findPairs_BruteForceSolution(array, sum);
        System.out.println("pairsBruteForceSolution = " + Arrays.toString(pairsBruteForceSolution));
    }

    private static String findPairs_PointerApproach(int[] array, int sum) { // {10, 15, -5, 15, -10, 5}

        Arrays.sort(array); //[-10, -5, 5, 10, 15, 15]
        //System.out.println("array = " + Arrays.toString(array));

        int left = 0;
        int right = array.length-1;

        while (left<right){
            int currentSum = array[left]+array[right];
            if(currentSum == sum){
                System.out.println("left = " + array[left]);
                System.out.println("right = " + array[right]);
                break;
            } else if (currentSum<sum) {
                left++;
            } else {
                right--;
            }
        }
        return "["+array[left]+","+array[right]+"]";
    }

    private static int[] findPairs(int[] arr, int sum) {
        int[] array = new int[0];
        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int start_index;
        int end_index;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i]; //18

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

