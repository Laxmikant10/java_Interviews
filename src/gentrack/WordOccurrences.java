package src.gentrack;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrences {
    public static void main(String[] args) {
        String s = "apple mango banana banana orange apple";

        String[] splitStr = s.split(" ");

        Map<String, Long> map = Arrays.stream(splitStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
