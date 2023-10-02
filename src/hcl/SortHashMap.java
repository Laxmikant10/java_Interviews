package src.hcl;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("math", 78);
        hashMap.put("english", 89);
        hashMap.put("hindi", 70);
        hashMap.put("db", 65);
        hashMap.put("java", 45);

        System.out.println("Sorting based on Map Key");
        //Sort based on keys
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
        for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println("---------------------------------");

        System.out.println("Sorting based on Map Values");
        // Create a list of map entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());


        // Sort the list by values using a lambda expression

        //entryList.sort(Map.Entry.comparingByValue());
        //entryList.sort(Comparator.comparing(Map.Entry::getValue));
        entryList.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        // Create a new LinkedHashMap to store the sorted entries
        System.out.println("Sorted Values in List --> "+entryList);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry:entryList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Sorted Map values based on values-->");
        sortedMap.forEach((k, v) -> System.out.println(k+" : "+v));
    }
}
