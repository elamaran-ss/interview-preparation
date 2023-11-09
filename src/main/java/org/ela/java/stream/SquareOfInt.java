package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,6,5,4,8,9,12,52);
        List<Integer> numbersSquare =
                numbers.stream().
                        map(num-> num*num).collect(Collectors.toList());
        List<Integer> collect = numbersSquare.stream()
                .map(num -> (int) Math.pow(num, 2)                )
                .collect(Collectors.toList());
        System.out.println("Square of Integers--> " +numbersSquare);
        System.out.println("Square of Integers--> " +collect);
    }
}
