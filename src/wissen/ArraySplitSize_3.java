package src.wissen;
/*
    int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int splitSize = 3;

    expected Output
       [0, 1, 2]
       [3, 4, 5]
       [6, 7, 8]
       [9]
 */

import java.util.Arrays;
public class ArraySplitSize_3 {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        splitArray_1stApproach(original, splitSize);

        //Brute-force solution
        bruteForceArraySplitter_2ndApproach(original, splitSize);

        //Quick and effective
        splitAndPrint_3rdApproach(original, splitSize);
    }

    private static void splitArray_1stApproach(int[] original, int splitSize) {
        System.out.println("1st approach while loop -->");

        int length = original.length;
        int startIndex = 0;

        while (startIndex < length) {
            int endIndex = Math.min(startIndex + splitSize, length);

            int[] subArray = new int[endIndex - startIndex];
            for (int i = 0; i < subArray.length; i++) {
                subArray[i] = original[i + startIndex];
            }

            System.out.println(Arrays.toString(subArray));

            startIndex += splitSize;
        }
    }

    private static void bruteForceArraySplitter_2ndApproach(int[] original, int splitSize) {
        System.out.println("2nd approach Brute-force solution -->");
        int originalLength = original.length;
        //Math.ceil() --> used to get nearest large number ex --> 3.5 => 4
        //Math.floor() --> used to get nearest small number ex --> 3.5 => 3
        //int subArraySize = (int) Math.ceil(originalLength / (double) splitSize); //below one also same
        int subArraySize = (int) Math.ceil((double) originalLength / splitSize);

        for (int i = 0; i < subArraySize; i++) {
            int startIndex = i * splitSize;
            int endIndex = Math.min(startIndex + splitSize, originalLength);

            int[] subArray = new int[endIndex - startIndex];
            int subArrayIndex = 0;

            for (int j = 0; j < subArray.length; j++) {
                subArray[subArrayIndex] = original[startIndex + j];
                subArrayIndex++;
            }
            String subArrayValues = Arrays.toString(subArray);
            System.out.println(subArrayValues);
        }
    }

    private static void splitAndPrint_3rdApproach(int[] original, int splitSize) {
        System.out.println("3rd Approach Quick and effective --> ");
        for (int i = 0; i < original.length; i += splitSize) {
            int endIndex = Math.min(original.length, splitSize + i);
            int[] subArrays = Arrays.copyOfRange(original, i, endIndex);
            System.out.println(Arrays.toString(subArrays));
        }
    }
}

