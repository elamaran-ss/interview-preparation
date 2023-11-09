package com.ascendion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        numbers.stream()
                .limit(5)
                .sorted(Collections.reverseOrder())
                .forEachOrdered(System.out::println);
        numbers.stream()
                .skip(5)
                .forEachOrdered(System.out::println);
    }
}
