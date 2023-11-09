package org.ela.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntDesc {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,-5,6,5,-4, -8,9,12,-52);
        List<Integer> revOrder = numbers.stream()
                .filter(num ->num%2 == 0 && num>0)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Numbers sorted in Reverse--> "+revOrder);
    }
}
