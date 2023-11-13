package src.deutsche_telekom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Given an integer array nums, return all the triplets
 * <p>
 * [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * <p>
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class Array_UniqueTriplets {
    //TODO
    public static void main(String[] args) {
        int[] nums = {12, 3, 6, 1, 6, 9};
        int sum = 24;
        /*int[] nums = {-1,0,1,2,-1,-4};
        int sum = 0;*/

        //Time Complexity: O(n2)
        //Space Complexity: O(n)
        List<List<Integer>> triplets = findTriplets(nums, sum);
        System.out.println("triplets = " + triplets);
    }

    private static List<List<Integer>> findTriplets(int[] nums, int sum) {

        Arrays.sort(nums);
        List<List<Integer>> pair = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        List<Integer> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int currentSum = nums[i] + nums[start] + nums[end];
                if (currentSum == sum) {
                    String str = nums[i] + ":" + nums[start] + ":" + nums[end];
                    if (!set.contains(str)) {
                        triplets.add(nums[i]);
                        triplets.add(nums[start]);
                        triplets.add(nums[end]);
                        pair.add(triplets);
                        triplets = new ArrayList<>();
                        set.add(str);
                    }
                    // increment the second value index
                    start++;
                    // decrement the third value index
                    end--;
                } else if (currentSum < sum) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return pair;
    }

}
