package src.pratititech;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterOccurrences {
    public static void main(String[] args) {
        String str = "JAVAJAVAE";
        String[] split = str.split("");
        Map<String, Long> map = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map = " + map);
    }
}
