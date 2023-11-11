package src.basic_stringsProblems;

import java.util.*;

/**
 * Expected array/list = [name11, name2, name44, name3, name3, name55]
 * Expected output: 55EMAN-44EMAN-11EMAN-3EMAN-2EMAN
 */
public class StringReverse_WithNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("name11", "name2", "name44", "name3", "name3", "name55");

        //Multiple data object as been used over here
        usingMapSetList_Approach(list);

        System.out.println("---------------------------------------------- ");

        //Minimal use of Data object
        usingList_Approach(list);

    }

    private static void usingMapSetList_Approach(List<String> list) {
        Set<String> output = new TreeSet<>();

        for (String s : list) {
            String s1 = s.toUpperCase();
            StringBuilder stringBuilder = new StringBuilder(s1);
            output.add(stringBuilder.reverse().toString());
        }

        System.out.println("output = " + output);

        Map<Integer, String> map = new TreeMap<>((o1, o2) -> Integer.compare(o2, o1));
        for (String value : output) {
            StringBuilder intKey = new StringBuilder();
            for (char c : value.toCharArray()) {
                if (Character.isDigit(c)) {
                    intKey.append(c);
                }
            }
            map.put(Integer.parseInt(intKey.toString()), value);
        }
        //System.out.println("map = " + map);

        List<String> finalList = new ArrayList<>();
        map.forEach((integer, s) ->
                finalList.add(s));

        String s1 = finalList.stream().reduce((s, s2) -> s + "-" + s2).get();
        System.out.println("ordered in desc = " + s1);
    }

    private static void usingList_Approach(List<String> list) {

        List<String> stringList = new ArrayList<>();

        for(String str: list){
            StringBuilder stringBuilder = new StringBuilder(str.toUpperCase());
            stringList.add(stringBuilder.reverse().toString());
        }
        System.out.println("stringList = " + stringList);

        //Writing custom sorting logic
        Comparator<String> cmp = (o1, o2) -> {

            int i1 = extractDigit(o1);
            int i2 = extractDigit(o2);

            return Integer.compare(i2,i1);
        };

        String result = stringList.stream().distinct().sorted(cmp).reduce((s1, s2) -> s1 + "-" + s2).get();

        System.out.println("result = " + result);
    }

    private static int extractDigit(String value){
        StringBuilder component = new StringBuilder();
        for(char c: value.toCharArray()){
            if(Character.isDigit(c)){
                component.append(c);
            }
        }
        return Integer.parseInt(component.toString());
    }
}

