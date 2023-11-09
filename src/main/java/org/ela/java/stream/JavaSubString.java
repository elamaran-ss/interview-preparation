package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaSubString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "apple", "deifJavaied", "banana", "ElaJava", "level", "orange");
        List<String> javaSubString = words.stream()
                .filter(str->str.contains("Java"))
                .collect(Collectors.toList());
        System.out.println("Java Substring--> "+javaSubString);
    }
}
