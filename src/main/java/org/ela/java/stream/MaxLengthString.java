package org.ela.java.stream;

import java.util.*;

public class MaxLengthString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Ap", "Banana", "Anxiety", "Apricot", "Alphabet", "Art", "Astronomy", "Cucumber", "Abacus", "Acceptance");
         strings.sort((o, t)->t.length()-o.length());
        Optional<String> result= strings.stream().min((in, out) -> out.length() - in.length());
        Optional<String> resultMin= strings.stream().min((in, out) -> in.length() - out.length() );
        System.out.println("Max value String--> "+strings);
        System.out.println("Max value String--> "+result);
        System.out.println("Max value String--> "+resultMin);
    }
}
