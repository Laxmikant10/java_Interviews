package src.infosys;

import java.util.HashSet;
import java.util.Set;

public class ProcessCountry {
    public static void main(String[] args) {
        Set<Country> c1 = new HashSet<>();
        c1.add(new Country("India",1234));
        c1.add(new Country("India",1234));

        System.out.println("c1 Size = " + c1.size());
    }
}
