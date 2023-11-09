package org.ela.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxValueInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,6,5,4,8,9,12,52);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> min1 = numbers.stream().min(Comparator.comparing(Integer::intValue));

        System.out.println("Max of Integer from List--> "+max);
        System.out.println("Min of Integer from List--> "+min);
        System.out.println("Min1 of Integer from List--> "+min1);
    }
}
