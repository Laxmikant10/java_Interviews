package src.accolite_digital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * input - EPPIIPIAAIAP
 * Output - #******AA*A*
 */
public class ReplaceCharInStringWithPattern {

    public static void main(String[] args) {
        //String str = "EIPPIPJJI";
        String str = "EPPIIPIAAIAP";

        String pattern = replaceCharInStringWithPattern(str);
        System.out.println("pattern = " + pattern);


    }

    private static String replaceCharInStringWithPattern(String str) {
        String[] split = str.split("");

        Map<String, Long> map = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println("map = " + map);

        ArrayList<Map.Entry<String, Long>> entries = new ArrayList<>(map.entrySet());

        entries.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        //System.out.println("entries11 = " + entries);

        int size = entries.size();

        long min = entries.get(0).getValue();
        //System.out.println("min = " + min);
        long max = entries.get(size - 1).getValue();
        //System.out.println("max = " + max);

        String replaceStr = str;

        for (Map.Entry<String, Long> entry : entries) {

            if (entry.getValue() == min) {
                replaceStr = replaceStr.replace(entry.getKey(), "#");
            }
            if (entry.getValue() == max) {
                replaceStr = replaceStr.replace(entry.getKey(), "*");
            }
        }
        return replaceStr;
    }
}
