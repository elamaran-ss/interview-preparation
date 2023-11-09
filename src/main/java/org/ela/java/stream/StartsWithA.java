package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Anxiety", "Apricot", "Alphabet", "Art", "Astronomy", "Cucumber", "Abacus", "Acceptance");
        List<String> result = strings.stream().filter(str-> str.startsWith("A")).collect(Collectors.toList());

        System.out.println("Resulting string-->" +result);
    }
}
