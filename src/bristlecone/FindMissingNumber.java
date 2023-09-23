package src.bristlecone;

//1
//[1,2,3,4,5,6,7,8,9,10,11,13,14,15,17,18]
//missing number = 12,16 (output)
public class FindMissingNumber {
    public static void main(String[] args) {

        //1st approach is good approach using enhanced 'for'
        missingNumber_1stApproach();
        System.out.println("------------------------------------------------------");
        missingNumber_2ndApproach();
    }

    private static void missingNumber_1stApproach() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18};
        int count = 0;
        for (int a : array) {
            count++;
            if (a != count) {
                System.out.println("1st approach Missing number => " + count);
                count++;
            }
        }
    }

    private static void missingNumber_2ndApproach() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18};
        int count = 1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != count) {
                System.out.println("2nd approach Missing number -> " + count);
                count++;
            }
            count++;
        }
    }
}
