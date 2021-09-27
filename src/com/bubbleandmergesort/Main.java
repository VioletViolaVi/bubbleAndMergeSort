package com.bubbleandmergesort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Bubble Sort */

        // empty arraylist of integers
        ArrayList<Integer> allNumbers = new ArrayList<>();
        // random numbers
        Random bubbleRandom = new Random();
        for(int i = 0; i < 8; i++){
            BubbleSort bubbleSort = new BubbleSort(bubbleRandom.nextInt(101));
            allNumbers.add(bubbleSort.getAnyNum());
        }
        // calls the sorting method made to show the final (sorted) answer
        BubbleSort.bubbleSorter(allNumbers);

        System.out.println("\n");

        /* Merge Sort */

        // generate 10 random ints for merge sorting
        Random mergeRand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = mergeRand.nextInt(101);
        }

        // print before merge sorting
        System.out.println("Before merge sorting: ");
        MergeSort.printArray(array);

        // invoke merge sorting
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        // print after merge sorting
        System.out.println("\nAfter merge sorting: ");
        MergeSort.printArray(array);
    }
}
