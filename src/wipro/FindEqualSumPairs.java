package src.wipro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find all ((a, b), (c, d)) pairs in a given number array such that a+b = c+d for eg..
Given a number array as [1,2,3,4,5] here are the possible outcomes [((1,4), (2,3)), ((4,2),(1,5))...]
* */
public class FindEqualSumPairs {

    static class pair {
        int first;
        int second;

        pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    static List<String> findPairs(int[] array, List<String> list) {
        Map<Integer, pair> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (!map.containsKey(sum)) {
                    map.put(sum, new pair(i, j));
                } else {
                    pair pair = map.get(sum);
                    System.out.println("Equal Pairs are : " + array[pair.first] + "," + array[pair.second]
                            + " & " + array[i] + "," + array[j]);

                    list.add("(" + array[pair.first] + "," + array[pair.second] + ")" + "," + "(" + array[i] + "," + array[j] + ")");
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<String> list = new ArrayList<>();

        List<String> pairs = findPairs(arr, list);
        System.out.println("-------------------");

        System.out.println("OutPut :- "+pairs);
    }
}
