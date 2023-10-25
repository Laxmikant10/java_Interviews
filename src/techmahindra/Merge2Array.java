package src.techmahindra;

import java.util.Arrays;

/**
 * {0,1,2,3,4}
 * {5,6,7,8,9}
 * output = {0,1,2,3,4,5,6,7,8,9}
 */
public class Merge2Array {

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};

        //BruteForceSolution
        merge2Array_BruteForceSolution(array1, array2);

        //Efficient & Effective way
        merge2Array(array1, array2);
    }

    private static void merge2Array(int[] array1, int[] array2) {
        int array1_length = array1.length;
        int array2_length = array2.length;

        int[] new_array = new int[array1_length + array2_length];

        System.arraycopy(array1,0,new_array,0,array1_length);
        System.arraycopy(array2,0,new_array,array1_length,array2_length);

        System.out.println("Efficient & Effective way new_array = " + Arrays.toString(new_array));
    }

    private static void merge2Array_BruteForceSolution(int[] array1, int[] array2) {

        int array1_length = array1.length;
        int array2_length = array2.length;

        int[] new_array = new int[array1_length + array2_length];

        for (int i = 0; i < array1_length; i++) {
            new_array[i] = array1[i];
        }

        for (int i = 0; i < array2_length; i++) {
            new_array[array1_length + i] = array2[i];
        }

        System.out.println("BruteForceSolution new_array = " + Arrays.toString(new_array));

    }
}
