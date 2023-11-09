package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class AbsoluteInt {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,-5,6,5,-4, -8,9,12,-52);
        List<Integer> absoluteNum = numbers.stream()
                .map(AbsoluteInt::absoluteNumberWithoutMath).collect(Collectors.toList());
        List<Integer> absoluteNumMath = numbers.stream()
                .map(AbsoluteInt::mathAbs).collect(Collectors.toList());
        out.println("Absolute Numbers in list--> "+absoluteNum);
        out.println("Absolute Numbers in list--> "+absoluteNumMath);
    }

    private static int absoluteNumberWithoutMath(Integer num){
        if(num<0)
        {
            return -(num);
        }
        return num;
    }

    private static Integer mathAbs(Integer num){
        return Math.abs(num);
    }
}
