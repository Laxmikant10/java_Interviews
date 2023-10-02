package src.infosys;

import java.util.HashSet;
import java.util.Set;

public class ProcessCountry {
    public static void main(String[] args) {
        Set<Country> c1 = new HashSet<>();
        c1.add(new Country("India",1234));
        c1.add(new Country("Pakistan",9801));
        c1.add(new Country("India",1234));
        c1.add(new Country("Japan",8977));

        System.out.println("c1 Size = " + c1.size());

        //If we comment or not have added hashcode() and equals() method in
        // Country we will not get Duplicate records

        c1.forEach(System.out::println);
    }
}
