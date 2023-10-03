package src.bristlecone;

import java.util.*;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str1 = "good";

        Set<Character> set = usingListSetDataStructure(str1);
        System.out.println("set = " + set);

        System.out.println("----------------------------");

        Set<Character> duplicateSet = usingSetSetDataStructure(str1);
        System.out.println("duplicateSet = " + duplicateSet);
    }

    private static Set<Character>  usingListSetDataStructure(String str1) {
        List<Character> list = new ArrayList<>();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str1.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            } else {
                set.add(c);
            }
        }
        return set;
    }

    private static Set<Character> usingSetSetDataStructure(String str1) {

        Set<Character> seenCharacters = new HashSet<>();
        Set<Character> duplicateCharacters = new HashSet<>();

        char[] charArray = str1.toCharArray();
        for (char c:charArray){
            if(!seenCharacters.add(c)){
                duplicateCharacters.add(c);
            }
        }
        return duplicateCharacters;
    }
}
