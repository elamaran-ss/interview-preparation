package org.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        try (Scanner inputSize = new Scanner(System.in)) {
            int sizeOfArray;
            System.out.println("Enter the size of your array >>: ");
            sizeOfArray = inputSize.nextInt();

            //Below code will get the input for each element of the array.
            int[] inputArray = new int[sizeOfArray];
            System.out.println("Please provide input for the value of array elements");
            for (int i = 0; i < sizeOfArray; i++) {
                inputArray[i] = inputSize.nextInt();
            }

            System.out.print("Size of the Array is: " + sizeOfArray + "\nElements of the Array--> " + Arrays.toString(inputArray) + "\n");
            int result = numberOfOneOperation(sizeOfArray, inputArray);

            System.out.println("It takes " + result + " operations to make all input to 1");

            /*
            Return 0 if all inputs are 1
            Return -1 if the input is impossible to convert to 1
            Return steps for other conditions
             */
        } catch (Exception ex) {
            //TODO Add Exception behavior
            ex.printStackTrace();
        }
    }

    private static int numberOfOneOperation(int size, int[] inputArray) {
        int result = 0;
        int numberOfOne = 0;
        int numberOfZero = 0;

        for (int i = 0; i < size; i++) {
            int num = inputArray[i];

            if (num == 1) {
                numberOfOne++;
                continue;
            } else if (num == 0) {
                numberOfZero++;
                continue;
            }
            while (num % 2 == 0) {
                num /= 2;
                result++;
            }
            if (num!=1 && num % 2 != 0) {
                result = -1;
                break;
            }
        }

        if (numberOfOne == size) {
            result = 0;
        } else if (numberOfZero == size) {
            result = -1;
        }
        return result;
    }
}
