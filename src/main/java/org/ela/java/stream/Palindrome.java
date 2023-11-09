package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "apple", "deified", "banana", "level", "orange");
        List<String> palindromeWords = words.stream()
                .filter(
                        str->{
                         for(int i=0;i<=str.length()/2;i++) {
                            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                             return false;
                            }
                         }
                            return true;
                        }
                ).collect(Collectors.toList());

        List<String> notPalindrome = words.stream().filter(
                str-> !str.contentEquals(new StringBuilder(str).reverse())
        ).collect(Collectors.toList());

        System.out.println("Input List--> "+words);
        System.out.println("Palindrome words in List--> "+palindromeWords);
        System.out.println("Not a Palindrome words in List--> "+notPalindrome);


    }
}
