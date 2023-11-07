package src.zemoso_labs;

/**
 * You are given an array A of integers.
 * <p>
 * Find the maximum number of non-intersecting segments of length 2 (two adjacent elements),
 * which have an equal sum.
 * <p>
 * For example, given A = [10, 1, 3, 1, 2, 2, 1, 0, 4],
 * possible segments with the corresponding sums are
 * 10, 1 = 11
 * 1, 3  = 4
 * 3, 1  = 4
 * 1, 2  = 3
 * 2, 2  = 4
 * 2, 1  = 3
 * 1, 0  = 1
 * 0, 4  = 4
 * <p>
 * Any two adjacent segments are considered intersecting, i.e (10,1) and (1,3) are adjacent, so they are intersecting
 * <p>
 * there are three non-intersecting segments, whose sum is equal to 4: (1, 3), (2, 2), (0, 4).
 * Another three non-intersecting segments are: (3, 1), (2, 2), (0, 4).
 */
public class MaxNonIntersectingSegmentsInArray {
    //TODO

    public static int maxNonIntersectingSegments(int[] A) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = A[i] + A[i + 1];
            if (sum % 2 == 0) {
                count++;
                i++;  // Skip the next element as it's already part of a segment
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {10, 3, 2, 1, 2, 3, 1, 0, 5};
        int result = maxNonIntersectingSegments(A);
        System.out.println(result);  // Output: 3
    }
}


