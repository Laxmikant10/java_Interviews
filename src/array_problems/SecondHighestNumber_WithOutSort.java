package src.array_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber_WithOutSort {

    public static void main(String[] args) {
        int[] arr = {3, 0, 10, 2, 5, 7, 12, 13, 9, 15, 11, 14, 8, 1};

        //Find Second Highest number

        List<Integer> collect = Arrays.stream(arr).boxed().sorted((o1, o2) -> Integer.compare(o2, o1)).skip(1).limit(1).collect(Collectors.toList());

        System.out.println("collect = " + collect);


        System.out.println(" ----------------------  ");

        withOutSort(arr);
    }

    private static void withOutSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int num : arr) { //{3, 0, 10, 2, 5, 7,12, 9,11, 8, 1}
            if (num > max) {//>12
                second_max = max; //10
                max = num; //12
            } else if (num > second_max && num < max) {
                second_max = num;
            }
        }

        System.out.println("max = " + max);
        System.out.println("second_max = " + second_max);
    }

}
