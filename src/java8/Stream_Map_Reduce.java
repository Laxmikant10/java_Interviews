package src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map_Reduce {
    //Map is used for manipulation and to get multiple output(in Stream)
    //Reduce is used for getting only single output
    public static void main(String[] args) {

        String[] strArray = {"Lalla", "laxmikant", "Anu", "Anushree", "Saurabh", "Bonker_Corner"};

        List<String> collect = Arrays.stream(strArray).map(s -> s + "_Ji").collect(Collectors.toList());
        System.out.println("Map output = " + collect);


        String longestString = Arrays.stream(strArray).reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();

        System.out.println("In Reduce function longestString = " + longestString);

        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //list.stream().map(x -> x + 1).forEach(System.out::println);
        List<Integer> integerList = list.stream().map(x -> x + 10).collect(Collectors.toList());
        System.out.println("Map integerList = " + integerList);

        Integer integer = list.stream().reduce((m, n) -> m + n).get();
        System.out.println("Reduce Function sum = " + integer);


        // Implementation of reduce method
        // to get the combined String
        String[] array = { "Lax", "Lux", "Laxii" };

        String combinedString = Arrays.stream(array).reduce((s1, s2) -> s1 + "-" + s2).get();
        System.out.println("Reduce Function combinedString = " + combinedString);



    }
}
