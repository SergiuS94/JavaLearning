package org.oca.Chapter3;

import java.util.Arrays;

public class C3_6c_Arrays_Searching {
    /**
     * In order to search into an array, it has to be sorted
     * for an unsorted array, the result will be unpredicted
     * If the target element is found, it will return the index of it
     * If it is not found, will calculate the index where it should be, will negate it and substract 1
     */


    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};//allready sorted, no need to use Arrays.sort(numbers)
        System.out.print("Initial array:");
        for (int number : numbers
        ) {
            System.out.print(number + " ");
        }

        System.out.println("\nThe index of 2 is:" + Arrays.binarySearch(numbers, 2));


    }
}
