package src.RIA_Advisory;

import java.util.*;

/*
input : {eat,ate,tea,tab,bat,rat}
output: {{eat,ate,tea},{tab,bat},{rat}}
*/
public class AnagramGrouping {

    private static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) { //{"eat", "ate", "tea", "tab", "bat", "rat"};
            // Sort the characters of the word
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            //Note ->
            // We can not use below one because it will use same String pool to store Information
            /*String sortedWord = charArray;*/
            //Instead of that use below one it will create new String pool every time
            String sortedWord = new String(charArray);

            // Check if the sorted word is in the map
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            // Add the word to the corresponding anagram group
            anagramGroups.get(sortedWord).add(word);
        }
        //Convert the values of the map to a list of lists
        List<List<String>> result = new ArrayList<>(anagramGroups.values());

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "ate", "tea", "tab", "bat", "rat"};

        List<List<String>> anagramsLists = groupAnagrams(words);

        System.out.println("anagramsLists = " + anagramsLists);

    }


}
