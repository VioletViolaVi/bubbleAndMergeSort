package com.bubbleandmergesort;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    private int anyNum;

    public BubbleSort(int anyNum) {
        this.anyNum = anyNum;
    }

    public int getAnyNum() {
        return anyNum;
    }

    public static void generateRandArrayOfNums(){
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
    }

    public static void bubbleSorter(ArrayList<Integer> intArray) {
        // length of array
        int intArrayLength = intArray.size();
        // currently, empty int variable
        int tempHolder;

        // prints ints before sorting
        System.out.println("Before bubble sorting: ");
        for(int i = 0; i < intArray.size(); i++){
            System.out.print(intArray.get(i) + ", ");
        }
        System.out.println();

        // checking 2 ints at a time to put in ascending order
        for (int i = 0; i < intArrayLength; i++) {
            for (int j = 0; j < intArrayLength; j++) {
                if (intArray.get(i) < intArray.get(j)) {
                    tempHolder = intArray.get(i);
                    intArray.set(i, intArray.get(j));
                    intArray.set(j, tempHolder);
                }
            }
        }

        // prints ints after sorting
        System.out.println("After bubble sorting: ");
        for(int i = 0; i < intArray.size(); i++){
            System.out.print(intArray.get(i) + ", ");
        }
        System.out.println();
    }
}
