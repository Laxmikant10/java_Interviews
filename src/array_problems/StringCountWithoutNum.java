package src.array_problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountWithoutNum {
    public static void main(String[] args) {
        String str = "h2ell8o wo2rld";
        String newStr = str.replace(" ", "");

        //System.out.println(newStr);

        String[] split = newStr.split("");
        Map<String, Long> map = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String strAlpa = "";

        char[] charArray = newStr.toCharArray();
        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                strAlpa += c;
            }
        }

        Map<String, Long> map1 = Arrays.stream(strAlpa.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("map = " + map);
        System.out.println("map1 = " + map1);

        System.out.println("str = " + str);

        String replace = str.replaceAll("[0-9]", "");
        System.out.println("replace = " + replace);

        Map<Character, Long> collect = str.chars().filter(c -> !Character.isDigit(c)).filter(c -> !Character.isWhitespace(c)).mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("collect = " + collect);
    }
}
