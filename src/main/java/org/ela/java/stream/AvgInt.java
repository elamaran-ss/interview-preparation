package org.ela.java.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvgInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,6,5,-4, 8,9,12,52);
        double average = AvgInt.avgOfNum(numbers);
        System.out.println("Average number--> "+average);
        List<Integer> numbersAvg =numbers.stream()
                .filter( num-> num>=average).collect(Collectors.toList());
        System.out.println("List of avg numbers--> "+numbersAvg);

    }

    private static double avgOfNum(List<Integer> numbers){
        return numbers.stream().mapToInt(x->x)
                .average().orElse(Double.NaN);
    }

}
