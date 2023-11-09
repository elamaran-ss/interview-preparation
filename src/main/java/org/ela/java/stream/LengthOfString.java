package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple", "Banana", "Anxiety", "Apricot", "Alphabet", "Art", "Astronomy", "Cucumber", "Abacus", "Acceptance");
        List<Integer> lengthOfString = strings.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of each string as List--> "+lengthOfString);
    }
}
