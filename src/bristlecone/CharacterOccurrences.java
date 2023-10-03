package src.bristlecone;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurrences {

    public static void main(String[] args) {
        String str = "good";
        charOccurrences(str);
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
}
