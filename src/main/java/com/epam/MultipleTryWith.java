package com.epam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultipleTryWith {

    public static void main(String[] args) {
        try {
            // Try-with-resources block for FileReader
            try (FileReader fileReader = new FileReader("D:\\Workstation\\Resources\\sample.txt")) {
                // Try-with-resources block for BufferedReader
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            } catch (IOException outerIOe) {
                System.err.println("Caught outer IOException: " + outerIOe.getMessage());
            }

            // Code that might throw NullPointerException
            String text = null;
            int length = text.length();

        } catch (NullPointerException npe) {
            System.err.println("Caught NullPointerException: " + npe.getMessage());
        }
    }
}

