package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;

public class ConCatString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "apple", "deifJavaied", "banana", "ElaJava", "level", "orange");
        String conCatString = words.stream()
                .reduce("",(first,second)->first+second)
                .toString();
        System.out.println("Concatenated String--> "+conCatString);
    }
}
