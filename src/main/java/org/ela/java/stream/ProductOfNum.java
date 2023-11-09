package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;

public class ProductOfNum {
    public static void main(String[] args) {
        final String[] myArray = { "ONE", "TWO", "THREE", "FOUR", "FIVE" };
        myArray[1] = "ONE1";

        System.out.println(myArray);
        List<Integer> numbers = Arrays.asList(1,2, 7, 10, 13, 21, 29, 33, 37, 43, 50);
        int product = numbers.stream()
                .reduce(1, (a,b)->a*b);
        System.out.println("Product of Numbers--> "+product);
    }
}
