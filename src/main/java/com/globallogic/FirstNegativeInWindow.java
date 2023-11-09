package com.globallogic;

import java.util.ArrayList;
import java.util.LinkedList;

public class FirstNegativeInWindow {
    /*
    Given an array of integers A of size N and an integer B.
Find the first negative integer for each and every window(contiguous subarray) of size B.If a window does not contain a negative integer, then return 0 for that window.
Input 1:
    A = [-1, 2, 3, -4, 5]
    B = 2

Output 1:
    [-1, 0, -4, -4]
    [1,5,6,8,10]



Input 2:
    A = [-8, 2, 3, -6, 10]
    B = 2
Output 2:
    [-8, 0, -6, -6]
     */
    public static void main(String[] args) {
        int[] A = {-1, -2, 3, 4, 5};
        int B = 3;
        FirstNegativeInWindow solution = new FirstNegativeInWindow();
        ArrayList<Integer> result = solution.findFirstNegative(A,B);
        System.out.println(result);
    }

    public ArrayList<Integer> findFirstNegative(int[] A, int B){
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<Integer> deque = new LinkedList<>();
        /*
        ArrayList<Integer> window = new ArrayList<>();
        for(int i=0;i<B; i++){
            if(A[i]<0){
                window.add(A[i]);
            }}
            if(!window.isEmpty()){
                result.add(window.get(0));
            }else {
                result.add(0);
            }
        for(int i=B; i<A.length; i++){
            if(A[i-B]<0){
                window.remove(0);
            }
            if(A[i]<0){
                window.add(A[i]);
            }
            if(!window.isEmpty()){
                result.add(window.get(0));
            }else{
                result.add(0);
            }
        }
        */

        for(int i=0; i<A.length; i++){
            while(!deque.isEmpty() && deque.getFirst()<i-B+1){
                deque.removeFirst();
            }

            while (!deque.isEmpty() && A[deque.getLast()]>=0){
                deque.removeLast();
            }

            deque.addLast(i);
            if (i>=B-1){
                result.add(Math.min(A[deque.getFirst()], 0));
            }
        }

        return  result;
    }

}
