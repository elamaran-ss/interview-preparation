package com.zafin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 23, 45, 67, 65, 31, 45);

        List<Integer> list2 = Arrays.asList(2, 3, 4, 7, 6, 1, 5);

        /*
        Take list, list2, combine two list in a new list and sort it in descending order
         */
        List<Integer> resultList = Stream.concat(list.stream(),list2.stream())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Resultant list--> "+resultList);

        int secondSmall = resultList.stream().sorted().skip(1).findFirst().get();

        System.out.println("Second smallest element: "+secondSmall);
    }
}
