package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,6,5,4,8,9,12,52);

        List<Integer> uniqueNum = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Numbers--> "+uniqueNum);
    }
}
