package src.array_problems;

import java.util.HashMap;
import java.util.Map;

public class LargestLengthSubArrayWithSumZero {

    /**
     * Effective way to find Largest sub array
     * @param arr
     * @return
     */
    private static int largestSubArrayUsingMap(int[] arr) {
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

    /**
     * Non-Effective way of finding largest sub array
     * @param arr
     * @return
     */
    private static int largestSubArrayLengthForLoop(int[] arr) {
        int max=0;
        for (int i=0;i<arr.length;i++){ //{15, -2, 2, -8, 1, 7, -10, 23}
            int currentSum = 0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                if(currentSum==0){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};
        int[] arr = {15, -2, 2, -8, 1, 7, -10, 23};

        int largestSubArrayLength = largestSubArrayUsingMap(arr);
        System.out.println("Effective way to find Largest sub array = " + largestSubArrayLength);

        System.out.println("---------------------------------------------");

        int largestSubArrayLengthForLoop = largestSubArrayLengthForLoop(arr);
        System.out.println("Non-Effective way of finding largest sub array = " + largestSubArrayLengthForLoop);
    }


}
