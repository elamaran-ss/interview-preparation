package com.viasat;

public class HelloWorld {
    public static void main(String[] args) {
        String input = "hellloArray";
//         -> h1e1ll2o1A1rr2a1y1
        System.out.println("Response-->" +inputConversion(input));
    }

    public static String inputConversion(String input){
        StringBuilder response = new StringBuilder();

        int length = input.length();
        int count = 1;

//        for (int i=0; i<length; i++){
//            char currentChar = input.charAt(i);
//            int count = 1;
//
//            while (i+1 < length && input.charAt(i+1) == currentChar){
//                count++;
//                i++;
//            }
//
//            response.append(currentChar);
//            response.append(count);
//        }

        for (int i=0; i<length; i++){

            if(i+1 <length && input.charAt(i+1) == input.charAt(i)){
                response.append(input.charAt(i));
                count++;
            }
            else {
                response.append(input.charAt(i));
                response.append(count);
                count=1;
            }
        }

        return response.toString();
    }
}
