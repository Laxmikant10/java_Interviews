package src.ness;

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

        findPair(arr, sum);
    }

    private static void findPair(int[] arr, int sum) {//1,3,6,8,15
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = sum - arr[i];//6

            if (map.containsKey(currentSum)) {
                int startIndex = map.get(currentSum);
                System.out.println("StartIndex = "+startIndex+" arr[startIndex] = "+arr[startIndex] +"\n"+"EndIndex = "+ i +" arr[EndIndex] = "+arr[i]);
                break;
            }
            map.put(arr[i],i );//1,0 3,1 6,2

        }
    }
}
