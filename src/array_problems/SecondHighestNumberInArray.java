package src.array_problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write the code to find 2nd highest number in single line using stream API
 */
public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        Integer[] arrOfInteger = {1, 2, 3, 4, 5, 5, 6, 6};

        int[] arrOfInt = {1, 2, 3, 4, 5, 5, 6, 6};

        String[] arrString = {"a", "bac"};

        Map<Integer, Long> collect = Arrays.stream(arrOfInteger).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect = " + collect);

        //Second-Highest Number
        int[] array = Arrays.stream(arrOfInt).sorted().distinct().toArray();
        System.out.println("distinct = " + Arrays.toString(array));
        System.out.println("Second Highest Number Normal way = " + array[array.length - 2]);

        //1. Second-Highest Number in single line
        int[] arrOfInt_1 = {1, 2, 3, 4, 5, 5, 6, 6};

        int value1 = Arrays.stream(arrOfInt_1)
                .boxed()
                .sorted(Collections.reverseOrder())
                .distinct()
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(-1);
        System.out.println("1. Second-Highest Number in single line = " + value1);

        //OR
        //2. Second-Highest Number in single line
        int[] arrOfInt_2 = {1, 2, 3, 4, 5, 5, 6, 6};

        Integer value2 = Arrays.stream(arrOfInt_2)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("2. Second-Highest Number in single line = " + value2);

    }
}
