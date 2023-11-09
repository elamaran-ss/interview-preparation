package com.epam;
public class ZipcodeImpl {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]); // Might throw ArrayIndexOutOfBoundsException

            try {
                String text = "123abc";
                int num = Integer.parseInt(text); // Might throw NumberFormatException
            } catch (NumberFormatException nfe) {
                System.err.println("Caught NumberFormatException: " + nfe.getMessage());
            }

            try {
                String str = null;
                int length = str.length(); // Might throw NullPointerException
            } catch (NullPointerException npe) {
                System.err.println("Caught NullPointerException: " + npe.getMessage());
            }

        } catch (Exception aioobe) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + aioobe.getMessage());
        }
    }
}
