package src.neoSoft;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DigitOccurrences {
    public static void main(String[] args) {

        long ll = 3453476253423L;

        getDigitOccurrences_lambdaExMethodRef(ll);

        getDigitOccurrences_lambdaExWithOutMethodRef(ll);

        getDigitOccurrences_bruteForceSolution(ll);


    }

    /**
     * without method reference
     */
    private static void getDigitOccurrences_lambdaExWithOutMethodRef(long ll) {
        String value = String.valueOf(ll);
        Map<Integer, Long> collect2 = value.chars().filter(c -> Character.isDigit(c))
                .mapToObj(c -> Character.getNumericValue(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("DigitOccurrences_LambdaExpressionWithOutMethodRef = " + collect2);
    }

    /**
     * with method reference
     */
    private static void getDigitOccurrences_lambdaExMethodRef(long ll) {
        String value = String.valueOf(ll);
        Map<Integer, Long> collect1 = value.chars()
                .filter(Character::isDigit)
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("DigitOccurrences_lambdaExpressionMethodRef = " + collect1);
    }

    /**
     * brute-Force Solution approach
     */
    private static void getDigitOccurrences_bruteForceSolution(long ll) {

        // Convert the long to a string
        String value = String.valueOf(ll);

        //Create a sub array from 0-9 to check the count of values
        int[] subArray = new int[10];

        // Iterate through each character in the string and count occurrences
        for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);

                subArray[numericValue] = subArray[numericValue] + 1;
            }
        }

        // Print the occurrences
        for (int i=0;i<subArray.length;i++){
            System.out.println("Digit : "+i+" Occurrences => "+subArray[i]);
        }
    }
}

