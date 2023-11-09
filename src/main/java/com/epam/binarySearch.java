package com.epam;

public class binarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {10,20,30,40,50,60,70,80,90,100};
        int target = 60;
        int result = binarySearchJava(sortedArray,target,0,sortedArray.length-1);

        System.out.println("Result--> "+ result);
    }
    public static int binarySearchJava(int[] arr, int target, int left, int right){
        if(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target) {
                return  binarySearchJava(arr,target, mid+1, right);
            }else {
                return binarySearchJava(arr,target, left, mid-1);
            }
        }else {
            return -1;
        }
    }
}
