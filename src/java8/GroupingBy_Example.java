package src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy_Example {
    public static void main(String[] args) {
        String str = "welcome to code decode and code decode welcome you";
        List<String> l1 = Arrays.asList(str.split(" "));
        Map<String, Long> map = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        String s = "welcome to Pune & Pune welcome Lax & Anu";
        List<String> l2 = Arrays.asList(s.split(" "));
        Map<String, Long> map1 = l2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
    }
}
