package org.ela.java.stream;

import java.util.function.Function;
import java.util.stream.Collectors;
import  java.util.Map;

public class DatumSoft {
    public static void main(String[] args) {
    String input="ElamaranSelvam";

    Map<Character, Long> charCount= input.chars()
            .mapToObj(c->(char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    charCount.entrySet().stream()
            .filter((entry->entry.getValue()>1))
            .forEach(entry-> System.out.println("Element: "+entry.getKey() +" = "+entry.getValue()));
    }
}
