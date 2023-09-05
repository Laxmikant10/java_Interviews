package src.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 2, 2, 6, 5);

        Object Integer;
        Set<Integer> collect = list.stream().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toSet());

        System.out.println("Duplicate : " + collect);

        list.stream().limit(5).forEach(z -> System.out.println(z));
        System.out.println(" =---------------------------------- ");
        list.stream().skip(5).forEach(x -> System.out.println(x));


    }
}

