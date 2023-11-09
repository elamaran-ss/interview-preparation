package org.ela.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "apple", "deified", "banana", "level", "orange");
        List<String> reverse = words.stream()
                .map(str-> {
                    return new StringBuilder(str).reverse().toString();
                }).collect(Collectors.toList());
        System.out.println("Reverse of Input String--> "+reverse);

        List<String> reversed=words.stream()
                .map(str->{
                            StringBuilder reverseString= new StringBuilder();
                            for(int i=str.length()-1;i>=0;i--){
                                reverseString.append(str.charAt(i));
                            }
                            return reverseString.toString();
                        }
                ).collect(Collectors.toList());
        System.out.println("Reverse of Input String appending builder--> "+reversed);
        List<String> reversedStrings = words.stream()
                .map(ReverseOfString::reverseString)
                .collect(Collectors.toList());
        System.out.println("Reverse of Input String appending builder--> "+reversedStrings);

    }

    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
