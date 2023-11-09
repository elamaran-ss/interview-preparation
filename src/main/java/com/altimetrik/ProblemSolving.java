package com.altimetrik;
/*
data:{
wrapped:{
actual:{
todate:"16-08-2023"
fromdate:"01-08-2023"
id : 156
name : "elamaran"
}
}
}
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProblemSolving {
    public static void main(String[] args) {
    String jsonString = "`data`:{\n" +
            "wrapped:{\n" +
            "actual:{\n" +
            "todate:\"16-08-2023\"\n" +
            "fromdate:\"01-08-2023\"\n" +
            "id : 156\n" +
            "name : \"elamaran\"\n" +
            "}\n" +
            "}\n" +
            "}";
    ProblemSolving object =  new ProblemSolving();
    object.extractDates(jsonString);
    }

    public void extractDates(String jsonString){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode root = objectMapper.readTree(jsonString);
            findDates(root);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void findDates(JsonNode node){
        if(node.isObject()){
            node.fields().forEachRemaining(
                    entry ->{
                        String fieldName = entry.getKey();
                        JsonNode fieldValue = entry.getValue();

                        if("todate".equals(fieldName) || "fromdate".equals(fieldName)){
                            System.out.println(fieldName +": "+fieldValue);
                        }
                    }
            );
        } else if (node.isArray()) {
            for(JsonNode arrayElement : node){
                findDates(arrayElement);
            }
        }
    }
}
