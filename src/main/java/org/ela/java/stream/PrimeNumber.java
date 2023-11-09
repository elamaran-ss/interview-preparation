package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2, 7, 10, 13, 21, 29, 33, 37, 43, 50);
        List<Integer> prime = numbers.stream().filter(
                num->{
                    for(int i=2;i<num/2;i++){
                        if(num%i==0){
                            return false;
                        }
                    }
                    return true;
                }
        ).collect(Collectors.toList());
        out.println("Prime Numbers--> "+prime);
        numbers.stream().forEach(num -> out.println(Math.sqrt(num)));
    }
}
