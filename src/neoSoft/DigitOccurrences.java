package src.neoSoft;

import java.util.Arrays;
import java.util.Collections;

public class DigitOccurrences {
    public static void main(String[] args) {
        //TODO
        long ll = 3453476253423l;
        String value = String.valueOf(ll);
        String[] split = value.split("");
        System.out.println("split = " + split.length);

        Arrays.stream(split).mapToInt(value1 -> Collections.frequency(Arrays.asList(split),value1)).forEach(System.out::print);
        //Arrays.


        // Arrays.stream(ll)

    }
}
