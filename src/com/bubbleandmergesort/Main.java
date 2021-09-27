package com.bubbleandmergesort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Bubble Sort */
        BubbleSort.generateRandArrayOfNums();

        System.out.println("\n");

        /* Merge Sort */
        MergeSort.generateRandomArrayOfInts();
    }
}
