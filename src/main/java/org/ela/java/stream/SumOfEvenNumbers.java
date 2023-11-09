package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,5,6,5,4,8,9,12,52);

        int reduce = numbers.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of Even Numbers--> "+reduce);

    }
}
