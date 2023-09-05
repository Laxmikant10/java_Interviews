package src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapMethods {

    public static void main(String[] args) {


        List<String> name = Arrays.asList("Lax", "swap", "Saurabh", "Bhatti", "Anushree", "Pode");

        //One-To-One mapping "map()"
        List<String> collect = name.stream().map(names -> names + "_BYE").collect(Collectors.toList());
        System.out.println("One-To-One -> Map = " + collect);

        List<List<String>> flatMapEx = new ArrayList<>();
        List<String> name1 = Arrays.asList("Lax", "Saurabh", "Bhatti", "Stark");
        List<String> name2 = Arrays.asList("Anu", "Pode");
        List<String> name3 = Arrays.asList("Kallu", "Tonni");
        List<String> name4 = Arrays.asList("Tallu");

        flatMapEx.add(name1);
        flatMapEx.add(name2);
        flatMapEx.add(name3);
        flatMapEx.add(name4);

        List<String> withoutFlatMap = flatMapEx.stream().map(names -> names + "").collect(Collectors.toList());
        System.out.println("without flat map = " + withoutFlatMap);

        List<String> withFlatMap = flatMapEx.stream().flatMap(names -> names.stream()).collect(Collectors.toList());

        System.out.println("One-To-Many --> withFlatMap = " + withFlatMap);

    }
}
