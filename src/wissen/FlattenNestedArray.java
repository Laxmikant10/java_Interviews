package src.wissen;

/**
 * Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
 * Output = {1,2,3,4,5,6,7,8,9,10}
 */

public class FlattenNestedArray {
    public static void main(String[] args) throws Exception {
        Object[] inputArray = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
        System.out.println("Input : {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10} ");
        System.out.println("Output-->");
        flattenAndPrint(inputArray);
    }

    public static void flattenAndPrint(Object[] inputArray) {

        for (Object obj : inputArray) {
            if (obj instanceof Object[]) {
                flattenAndPrint((Object[]) obj);
            } else {
                System.out.print(obj + " ");
            }
        }
    }
}