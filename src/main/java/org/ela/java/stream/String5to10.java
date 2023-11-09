package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String5to10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "apple", "deified", "banana", "Ela", "level", "orange");
        List<String> string5to10 = words.stream()
                .filter(str-> str.length()>=5 && str.length()<=10)
                .collect(Collectors.toList());
        System.out.println("String length greater than 5 less than 10 --> "+string5to10);
    }
}
