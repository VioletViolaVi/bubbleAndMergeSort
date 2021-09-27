package com.bubbleandmergesort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Bubble Sort
        // empty arraylist of integers
        ArrayList<Integer> allNumbers = new ArrayList<>();
        // random numbers
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            BubbleSort bubbleSort = new BubbleSort(random.nextInt(101));
            allNumbers.add(bubbleSort.getAnyNum());
        }
        // calls the sorting method made to show the final (sorted) answer
        BubbleSort.bubbleSorter(allNumbers);

        System.out.println("\n");

        // Merge Sort
        int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        System.out.println("Before merge sorting: ");
        MergeSort.printArray(array);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        System.out.println("\nAfter merge sorting: ");
        MergeSort.printArray(array);
    }
}
