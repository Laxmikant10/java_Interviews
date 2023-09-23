package src.bristlecone;

//1
/*["app1","App1","app2","app3","aPp3"]
 Remove the duplicates irrespective*/

//2
//   Input     [ApP1, app1, ApP2, ApP3,app3]
//   Output     [ApP1,ApP2,ApP3]

//3
/*Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
 Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]*/

//4
//Reverse order
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18

import java.util.*;
import java.util.stream.Collectors;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strArray1 = {"app1", "App1", "app2", "app3", "aPp3"};
        System.out.println("Original Array = " + Arrays.toString(strArray1));

        //1. Remove Duplicate
        Set<String> set = new HashSet<>();
        for (String s : strArray1) {
            String str = s.toLowerCase();
            set.add(str);
        }
        System.out.println("Remove Duplicate = " + set);
        System.out.println("----------------------------------------------------");

        //2 Print Camel-Case letter
        String[] strArray2 = {"ApP1", "app1", "ApP2", "ApP3", "app3"};
        System.out.println("Original Array = " + Arrays.toString(strArray2));

        List<String> list = new ArrayList<>();
        for (String s : strArray2) {
            char c = s.charAt(0);
            if (c == 'A') {
                list.add(s);
            }
        }
        System.out.println("Camel-Case letter = " + list);

        System.out.println("----------------------------------------------------");

        //3 Sort Array in Ascending
        int[] intArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println("Original Array = " + Arrays.toString(intArray));
        int[] array = Arrays.stream(intArray).sorted().toArray();
        System.out.println("Sorted Array = " + Arrays.toString(array));

        System.out.println("----------------------------------------------------");

        //4 Sort List in Descending
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        System.out.println("Original List = " + integerList);
        List<Integer> reverse_array = integerList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("List in Descending order = " + reverse_array);
        System.out.println("----------------------------------------------------");

    }
}
