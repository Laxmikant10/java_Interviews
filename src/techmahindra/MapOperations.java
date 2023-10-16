package src.techmahindra;

import java.util.*;

public class MapOperations {
    //TODO
    public static void main(String[] args) {
        Map<String,Integer> map1 =  new HashMap<>();

        map1.put("JAVA",80);
        map1.put("GCP",12);
        map1.put("XYZ",34);

        Map<String,Integer> map2 =  new HashMap<>();

        map1.put("English",88);
        map1.put("Math",44);


        Map<String, Integer> map = new HashMap<>();

        map.putAll(map1);
        map.putAll(map2);

        System.out.println(map);
       /* map.forEach((k,v)-> {System.out.println(k);
            System.out.println(v);
        });*/
    }
}
