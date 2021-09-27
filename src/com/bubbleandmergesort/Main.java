package com.bubbleandmergesort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // allows user to input response
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which sorting method would you like? Enter Bubble or Merge?");
        String userResponse = scanner.next();

        // continues until a sorting type is selected
        boolean continueSorting = true;
        while (continueSorting) {
            if (userResponse.equalsIgnoreCase("Bubble")) {

                // records nano time from start of sorting
                long nanoTimeBefore = System.nanoTime();

                /* Bubble Sort */
                BubbleSort.generateRandArrayOfNums();

                // records nano time from start of sorting
                long nanoTimeAfter = System.nanoTime();

                // length of execution
                long timeTakenToExecute = nanoTimeAfter - nanoTimeBefore;
                System.out.println("Amount of nano seconds taken to execute: " + timeTakenToExecute);

                continueSorting = false;
            } else if (userResponse.equalsIgnoreCase("Merge")) {

                // records nano time from start of sorting
                long nanoTimeBefore = System.nanoTime();

                /* Merge Sort */
                MergeSort.generateRandomArrayOfInts();
                continueSorting = false;

                // records nano time from start of sorting
                long nanoTimeAfter = System.nanoTime();

                // length of execution
                long timeTakenToExecute = nanoTimeAfter - nanoTimeBefore;
                System.out.println("Amount of nano seconds taken to execute: " + timeTakenToExecute);
            } else {
                System.out.println("Please choose between Bubble or Merge.");
                userResponse = scanner.next();
            }
        }
    }
}
