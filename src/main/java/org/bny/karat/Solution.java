package org.bny.karat;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] argv) {
        String tiles_1 = "88844";//true
        String tiles_2 = "99";//true
        String tiles_3 = "55555";//false
        String tiles_4 = "22333333";//true
        String tiles_5 = "77777777777777799999999999999933333344444444";//false
        String tiles_6 = "111333555";//false
        String tiles_7 = "42";//false
        String tiles_8 = "888";//false
        String tiles_9 = "100100000";//false
        String tiles_10 = "346664366";//false
        String tiles_11 = "8999998999898";//false
        String tiles_12 = "17610177";//false
        String tiles_13 = "600061166";//false
        String tiles_14 = "6996999";//false
        String tiles_15 = "03799449";//false
        String tiles_16 = "64444333355556";//false
        String tiles_17 = "7";//false

    /*
    Valid Tile -- Only one pair and any number of triples.

    1. Input String to str[]
    2. Parse/Iterate the instance - type cast to int
    3. Map key(instance(n)) value-count++
    4. Parse elements of map, check the key -

      4.1 Flag-> pair=False occurence value % 2 == 0 ? true => pair found flag-> pair=True,
          false check for 4.2
      4.2 occurence value % 3 == 0 ? true => triplet found false=> return False
      4.3 if any pair found return False
      4.4 if 4.1 and 4.2 returns true till end of iteration return True.
    */
        System.out.println(complete(tiles_1));
        System.out.println(complete(tiles_2));
        System.out.println(complete(tiles_3));
        System.out.println(complete(tiles_4));
        System.out.println(complete(tiles_5));
        System.out.println(complete(tiles_6));
        System.out.println(complete(tiles_7));
        System.out.println(complete(tiles_8));
        System.out.println(complete(tiles_9));
        System.out.println(complete(tiles_10));
        System.out.println(complete(tiles_11));
        System.out.println(complete(tiles_12));
        System.out.println(complete(tiles_13));
        System.out.println(complete(tiles_14));
        System.out.println(complete(tiles_15));
        System.out.println(complete(tiles_16));
        System.out.println(complete(tiles_17));

    }

    private static boolean complete(String tiles){
        boolean tileResponse=false;
        String[] tileArray=tiles.split("");
        Map<String,Integer> tileMap= new HashMap<>();

        //Parsing the input string to a Map with Key as String(tile) and value as n count of occurence
        for (String s : tileArray) {
            if(!tileMap.containsKey(s)){
                tileMap.put(s,1);
            }else{
                tileMap.put(s,(tileMap.get(s))+1);
            }
        }
//        System.out.println(tileMap.toString());

        boolean pair=false;
        for(String key:tileMap.keySet()){
            if(tileMap.get(key)==2){
            if(pair){
                return tileResponse;
            }
            pair=true;
            }else{
                if(tileMap.get(key)%3!=0){
                   return tileResponse;
                }
            }
        }
        if (!pair) {
            return tileResponse;
        }
        return true;
    }
}
