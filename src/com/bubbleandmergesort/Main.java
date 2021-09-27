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
                /* Bubble Sort */
                BubbleSort.generateRandArrayOfNums();
                continueSorting = false;
            } else if (userResponse.equalsIgnoreCase("Merge")) {
                /* Merge Sort */
                MergeSort.generateRandomArrayOfInts();
                continueSorting = false;
            } else {
                System.out.println("Please choose between Bubble or Merge.");
                userResponse = scanner.next();
            }
        }
    }
}
