package src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Peek,Limit & Skip functionality
/*Peek --> to check the values in between streaming operation.
This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline*/

//Limit --> just print or give values till given limit
//Skip --> skip the given number and print remaining values
public class Stream_Peek_Limit_Skip {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Peek Functionality
        System.out.println("Peek Functionality");
        list.stream().peek(System.out::println).toList();
        //System.out.println("integerList = " + integerList);

        System.out.println("original list = " + list);

        //list.stream().limit(3).forEach(System.out::println);
        List<Integer> limit_Ref = list.stream().limit(3).toList();
        System.out.println("Limit functionality  = " + limit_Ref);
        List<Integer> skip_Ref = list.stream().skip(3).toList();
        System.out.println("Skip functionality = " + skip_Ref);


    }
}
