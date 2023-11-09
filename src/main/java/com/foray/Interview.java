package com.foray;

public class Interview {

    public static void main(String[] args) {
        System.out.println("Sum of given Numbers: "+Interview.addLargeNumbers("1234","4567"));

    }
    public static String addLargeNumbers(String number1, String number2){
        /*
        number 1 = 9912340997866
        number 2 = 45678767690
         */
        int sum=0;
        while(number1.length()>=1){
            String numberX;
            String numberY;
            if (number1.length() >= 3) {
                numberX=number1.substring(number1.length()-3);
                numberY=number2.substring(number2.length()-3);
                number1=number1.substring(0,number1.length()-3);
                number2=number2.substring(0,number2.length()-3);
                sum=addIndex(numberX,numberY);
            }else{
                numberX=number1;
                numberY=number2;
                number1=number1;
                number2=number2;
                sum=addIndex(numberX,numberY);
            }

            sum=addIndex(numberX,numberY);
        }
        return String.valueOf(sum);
    }

    public static Integer addIndex(String number1, String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        return   num1+num2;
    }

    public static String addNumbers(String num1, String num2){
        int maxLength = Math.max(num1.length(),num2.length());
        StringBuilder result = new StringBuilder(maxLength+1);


        return result.toString();
    }
}
