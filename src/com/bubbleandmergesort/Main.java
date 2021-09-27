package com.bubbleandmergesort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // empty arraylist of INTEGERS made - these are INTEGERS!!!
        ArrayList<Integer> allNumbers = new ArrayList<>();

        // random numbers
        Random random = new Random();

        for(int i = 0; i < 8; i++){
            BubbleSort bubbleSort = new BubbleSort(random.nextInt(101));
            allNumbers.add(bubbleSort.getAnyNum());
        }

        // calls the sorting method made to show the final (sorted) answer
        BubbleSort.bubbleSorter(allNumbers);
    }
}
