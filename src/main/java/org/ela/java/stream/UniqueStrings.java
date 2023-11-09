package org.ela.java.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "date", "elderberry", "fig");
        List<String> wordsUnique = words.stream()
                .filter(word->words.indexOf(word)== words.lastIndexOf(word))
                .collect(Collectors.toList());
        System.out.println("Unique strings--> "+wordsUnique);

    }
}
