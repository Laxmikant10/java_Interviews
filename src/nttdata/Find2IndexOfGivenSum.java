package src.nttdata;

/**
 * Given a sorted array large size of int[] arr= {4,6,12, 13,15,17,19,…}
 * and sum is addition of two elements in an array.
 * Find the index of elements which adds up to sum. Use efficient algorithm
 */
public class Find2IndexOfGivenSum {
    public static void main(String[] args) {
        int[] array = {4, 6, 12, 13, 15, 17, 19};
        int sum = 25;

        getIndexUsingWhileLoop(array, sum);
        System.out.println("--------------------------------");
        getIndexUsingForLoop(array, sum);
    }

    private static void getIndexUsingWhileLoop(int[] array, int sum) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int currentSum = array[left] + array[right];

            if (currentSum == sum) {
                System.out.println("Sum of " + sum + " at index : " + left + "," + right);
                break;
            } else if (currentSum < sum) {
                left++;
            } else {
                right++;
            }
        }
    }
    public static void getIndexUsingForLoop(int[] array, int sum){

        for(int i=0;i<array.length;i++){
            for(int j =i+1;j< array.length;j++){
                int currentSum = array[i]+array[j];
                if(currentSum==sum){
                    System.out.println("For Sum of "+sum+" at index :"+i+","+j);
                }
            }
        }

    }
}
