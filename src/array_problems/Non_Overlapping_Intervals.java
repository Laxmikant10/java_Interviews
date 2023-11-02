package src.array_problems;

import java.util.Arrays;
import java.util.Comparator;

//Problem
//https://leetcode.com/problems/non-overlapping-intervals/
public class Non_Overlapping_Intervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return 0;
        }

        ////UnSorted Array
        for (int[] ints : intervals) {
            System.out.print(Arrays.toString(ints) + " ");
        }
        System.out.println();
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        //Sorted Array
        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        //Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        int count = 0;
        int n = intervals.length;
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][0];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals = {{1,2},{1,2},{1,2}};
        Non_Overlapping_Intervals obj = new Non_Overlapping_Intervals();
        int count = obj.eraseOverlapIntervals(intervals);
        System.out.println();
        System.out.println(count);
    }
}
