package src.ust;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * How you will calculate sum of square of even number
 * List < Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 * <p>
 * 1. even number
 * 2. square number
 * 3. sum
 */
public class ListOperations {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> collect = integerList.stream().filter(x -> x % 2 == 0).map(integer -> integer * integer).collect(Collectors.toList());

        System.out.println("collect = " + collect);
        int sum = integerList.stream().filter(x -> x % 2 == 0).map(integer -> integer * integer).mapToInt(x -> x).sum();
        System.out.println("sum = " + sum);
    }

}
