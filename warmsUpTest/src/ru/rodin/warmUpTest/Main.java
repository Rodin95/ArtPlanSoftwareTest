package ru.rodin.warmUpTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any text: ");
        String inputString = scanner.nextLine();

        System.out.print("Original string: " + inputString + "\n" + "Reversed string: " + reverse(inputString));

    }

    public static String reverse(String string) {

        String reverseString = "";
        int[] repeat = {1000, 10000, 100000};

        for (Integer element : repeat) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < element; i++) {

                reverseString = String.valueOf(new StringBuilder(string).reverse());
            }

            System.out.printf(element + " repetitions - " + "%d milliseconds;\n", System.currentTimeMillis() - startTime);
        }

        return reverseString;
    }

}
