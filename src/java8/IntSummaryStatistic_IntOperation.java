package src.java8;

import java.util.Arrays;
import java.util.List;

public class IntSummaryStatistic_IntOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 21, 39, 15, 6, 79, 8);

        System.out.println("list = " + list);

        int min = list.stream().mapToInt(x -> x).min().getAsInt();
        System.out.println("min = " + min);
        int max = list.stream().mapToInt(x -> x).max().getAsInt();
        System.out.println("max = " + max);
        double average = list.stream().mapToInt(value -> value).average().getAsDouble();
        System.out.println("Average = " + average);
    }
}
