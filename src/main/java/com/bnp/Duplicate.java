package com.bnp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,1,5);
        List<Integer> response =input.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("Response--> "+response);
    }
}
