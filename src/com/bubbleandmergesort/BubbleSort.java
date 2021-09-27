package com.bubbleandmergesort;

import java.util.ArrayList;

public class BubbleSort {
    private int anyNum;

    public BubbleSort(int anyNum) {
        this.anyNum = anyNum;
    }

    public int getAnyNum() {
        return anyNum;
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

