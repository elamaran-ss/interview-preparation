package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLessThan3 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple", "Ap",""," ", "Banana", "Anxiety", "Apricot", "Alphabet", "Art", "Astronomy", "Cucumber", "Abacus", "Acceptance");
        List<String> lessThan3 = strings.stream().filter(str->str.length()<=3).collect(Collectors.toList());
        System.out.println("Stream of string less than 3 length--> "+lessThan3);
    }
}
