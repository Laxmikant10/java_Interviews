package src.capgemini;

import java.util.*;
import java.util.stream.Collectors;

/**
 * filter the element till 1,2,3
 */
public class FilterValuesFromMap {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(2, 22);
        hashMap.put(3, 33);
        hashMap.put(5, 55);
        hashMap.put(1, 11);
        hashMap.put(4, 44);
        hashMap.put(6, 3);
        hashMap.put(9, 2);
        hashMap.put(8, 1);

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("linkedHashMap = " + linkedHashMap);

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());

        List<Map.Entry<Integer, Integer>> collect = list.stream().filter(x -> x.getKey() <= 3).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        System.out.println(" Sort value based on map values --> ");

        list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        System.out.println("list = " + list);
    }
}
