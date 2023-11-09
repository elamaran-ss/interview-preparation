package com.epam;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProjectInterview {
    public static void main(String[] args) {
        String input ="I am interested to grow in my organization l";

        Map<Character,Long> characterLongMap = input.toLowerCase().chars()
                .mapToObj(c ->(char) c)
                .collect(LinkedHashMap::new,
                        (map,c)->map.merge(c,1L,Long::sum),(characterLongLinkedHashMap, characterLongLinkedHashMap2)->{});

        System.out.println(characterLongMap.toString());

        char firstNonRepeated = input.chars()
                .mapToObj(c->(char)c)
                .filter(c->
                        characterLongMap.get(Character.toLowerCase(c))==1)
                .findFirst()
                .orElse('s');
        System.out.println("Non repeated char: "+firstNonRepeated);



    }
}
