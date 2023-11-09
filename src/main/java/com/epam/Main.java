package com.epam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        int number = 41716204;
        String digitsToFind = "24610";
        Map<Character, List<Integer>> digitIndices = new HashMap<>();
        for(int i=0; i<digitsToFind.length(); i++) {
            char digit = digitsToFind.charAt(i);
            int index = -1;

            String numberString = String.valueOf(number);
            List<Integer> indicesList = new ArrayList<>();

            do {
                index = numberString.indexOf(digit, index + 1);
                if (index != -1) {
                    indicesList.add(index);
                }
            }while (index!=-1);

                if(!indicesList.isEmpty()){
                   digitIndices.put(digit,indicesList);
                }
        }
        for(Map.Entry<Character, List<Integer>> entry: digitIndices.entrySet()){
            char digit = entry.getKey();
            List<Integer> indices = entry.getValue();
            System.out.println("Digit: "+digit+" found at index: "+indices);
        }

    }
}
