package com.epam;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value){
        if(top <maxSize-1){
            stackArray[++top] = value;
        }else {
            System.out.println("Stack is full");
        }
    }
    public int pop(){
    if(top>=0){
        return stackArray[--top];
    }else {
        System.out.println("Stack is empty");
        return -1;
    }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack--> "+stack);
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
    }


}


