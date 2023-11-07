package src.mastercard;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Array = [3, 5, -4, 8, 11, 1, -1, 6]
 * Target Sum = 10
 * Result = [-1,11]
 */
public class FindThePairFormArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, -4, 8, 11, 1, -1, 6};
        int sum = 10;
        //int sum = 6;
        System.out.println("Using Map -->");
        findNumbersForGivenSum_UsingMap(arr, sum);

        System.out.println("Using Set -->");
        findNumbersForGivenSum_UsingSet(arr, sum);
    }

    private static void findNumbersForGivenSum_UsingMap(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int component = sum - arr[i];

            if (map.containsKey(component)) {
                int startIndex = map.get(component);
                int endIndex = i;
                System.out.println("startIndex = " + startIndex + " : " + "arr[startIndex] = " + arr[startIndex]);
                System.out.println("endIndex = " + endIndex + " : " + "arr[endIndex] = " + arr[endIndex]);
                break;
            }
            map.put(arr[i], i);
        }
    }

    private static void findNumbersForGivenSum_UsingSet(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int value : arr) {
            int complement = sum - value;
            if (set.contains(complement)) {
                System.out.println(value + "::" + complement);
            }
            set.add(value);
        }
    }


}
