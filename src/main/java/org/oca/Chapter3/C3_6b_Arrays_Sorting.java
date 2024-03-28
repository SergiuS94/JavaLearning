package org.oca.Chapter3;

import java.util.Arrays;

public class C3_6b_Arrays_Sorting {
    public static void main(String[] args) {
        int[] numbers = {6, 4, 9, 5};
        System.out.println("Initial int array:6, 4, 9, 5");
        Arrays.sort(numbers);
        System.out.print("The sorted numbers are:");
        for (int number : numbers
        ) {
            System.out.print(number + " ");
        }

        System.out.println();
        //STRING
        String[] strings = {"10", "9", "100"};
        System.out.println("\nInitial String array:10, 9, 100");
        Arrays.sort(strings); //10, 100, 9->char order
        System.out.print("The sorted String array:");
        for (String string : strings
        ) {
            System.out.print(string + " ");
        }



    }
}
