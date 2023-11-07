package src.array_problems;

import java.util.HashMap;
import java.util.Map;
/*
This code is valid only for consecutive array or else refer mastercard code for betterment
 */
public class FindSubArrayWithGivenSum {

    private static void subArraySum(int[] array, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int startIndex = 0;
        int endIndex = -1;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum - sum == 0) {
                endIndex = i;
                break;
            }
            if (map.containsKey(currentSum - sum)) {
                startIndex = map.get(currentSum - sum) + 1;
                endIndex = i;
                break;
            }
            map.put(currentSum,i);
        }
        if(endIndex ==-1){
            System.out.println(" Not found");
        }else {
            System.out.println(startIndex+","+endIndex);
            System.out.println("Index values => "+ array[startIndex]+" & "+array[endIndex]);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 15, -5, 15, -10, 5};
        int sum = 5;

        subArraySum(array, sum);
    }
}

