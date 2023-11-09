package com.viasat;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";
        String input1 = "[()]}";
        System.out.println("Response of input is "+checkBalancedParantheses(input)+ " parantheses");
        System.out.println("Response of input is "+checkBalancedParantheses(input1)+ " parantheses");
    }

    public static boolean checkBalancedParantheses(String input){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<input.length(); i++){

            char currentChar = input.charAt(i);

            if(currentChar == '[' || currentChar == '{' || currentChar == '('){
                stack.push(currentChar);
            } else if (currentChar == ']' || currentChar == '}' || currentChar == ')') {
                if(stack.isEmpty() || !matchPair(stack.peek(),currentChar)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean matchPair(char char1, char char2){

        return ((char1 == '(' && char2 == ')') ||
                (char1 == '[' && char2 == ']') ||
                (char1 == '{' && char2 == '}')
        );
    }
}
