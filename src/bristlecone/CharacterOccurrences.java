package src.bristlecone;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrences {

    public static void main(String[] args) {
        String str = "good";
        charOccurrences(str);
        groupByMethod(str);
    }

    private static void charOccurrences(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] charArray = str.toCharArray();
        for(char c:charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    public static void groupByMethod(String str){
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map = " + map);
    }
}
