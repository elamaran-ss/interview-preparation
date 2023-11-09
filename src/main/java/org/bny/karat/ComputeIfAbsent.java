package org.bny.karat;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        Map<String,Integer> tileMap= new HashMap<>();
        tileMap.put("apple", 1);
        tileMap.put("banana", 2);
//        tileMap.put("orange",2);

        tileMap.computeIfAbsent("orange",k->1);
        tileMap.put("orange",2);


        System.out.println(tileMap.toString());
    }
}
