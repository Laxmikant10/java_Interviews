package src.java8;

import java.util.HashMap;
import java.util.Map;

public class MapCamelLetter {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("laxmikant", "shastrakar");

        map.forEach((k, v) -> System.out.println(k.substring(0, 1).toUpperCase() + k.substring(1)
                + " " + v.substring(0, 1).toUpperCase() + v.substring(1)));
    }
}
