package src.array_problems;

import java.util.Arrays;
import java.util.HashSet;

public class Array_Triplets {

    public static void main(String[] args) {

        /*int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;*/

        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;

        //Time complexity -> O(N^3)
        findTriplets_forLoop(arr, sum);

        //Time complexity -> O(N^2) :- using Hashing
        findTriplets_HashingApproach(arr, sum);

        //Time complexity -> O(N^2) :- Pointer Approach
        findTriplets_PointerApproach(arr, sum);
    }

    private static void findTriplets_forLoop(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int currentSum = arr[i] + arr[j] + arr[k];
                    if (currentSum == sum) {
                        System.out.println("Triplet are -> ");
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }
    }

    private static void findTriplets_PointerApproach(int[] arr, int sum) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == sum) {
                    System.out.println("Triplet are -> ");
                    System.out.println(arr[i] + "," + arr[left] + "," + arr[right]);
                    break;
                } else if (currentSum < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    private static void findTriplets_HashingApproach(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 2; i++) {
            HashSet<Integer> hashSet = new HashSet<>();

            int currentSum = sum - arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int requiredSum = currentSum - arr[j];
                if (hashSet.contains(requiredSum)) {
                    System.out.println("Triplets are(Hashing Approach) --> ");
                    System.out.println(arr[i] + "," + arr[j] + "," + requiredSum);
                    break;
                }
                hashSet.add(arr[j]);
            }
        }
    }
}
