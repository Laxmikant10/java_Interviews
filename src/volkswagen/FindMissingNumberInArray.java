package src.volkswagen;

import java.util.Arrays;

/*Find missing number in the array.
  You are given an integer array containing 1 to n but one of the numbers
  from 1 to n in the array is missing.

        int[] arr1={7,5,6,1,4,2};
        Missing numner : 3

        int[] arr2={5,3,1,2};
        Missing numner : 4*/
public class FindMissingNumberInArray {

    public static void main(String[] args) {
        int[] arr1 = {7,5,6,1,4,2};

        int length_1 = arr1.length + 1;

        //n*(n+1)/2
        int n_consecutive_sum = (length_1) * (length_1 + 1) / 2;

        System.out.println(n_consecutive_sum);

        int sum = Arrays.stream(arr1).sum();

        System.out.println("sum = " + sum);
        int missingNumber = n_consecutive_sum - sum;

        System.out.println("Missing number from array is : " + missingNumber);
    }

}
