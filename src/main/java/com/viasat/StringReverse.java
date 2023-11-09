package com.viasat;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Reverse String";
        System.out.println("Reversed--> "+reverseString(input));
        System.out.println("Reversed--> "+twoPointer(input));

    }

    public  static  String reverseString(String input){
        StringBuilder reversed = new StringBuilder();
        for (int i=input.length()-1;i>=0; i--){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public  static String twoPointer(String input){
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length-1;

        while (left<right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}
