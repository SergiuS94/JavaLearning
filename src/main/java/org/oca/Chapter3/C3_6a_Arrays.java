package org.oca.Chapter3;

import java.util.Arrays;

public class C3_6a_Arrays {
    public static void main(String[] args) {
        //declaration
        int[] numbers = new int[3];
        int[] numbers2 = new int[]{10, 20, 33};//initialized array
        //numbers2[3]=5;//out of bounds exception, length is 3, not 4
        System.out.println("The address of the array is:" + numbers);//will return the addres of the array, ex [I@10f87f48
        System.out.println("the first value of uninitailized int array is:" + numbers[0]);//0->default values if not initialized
        System.out.println("the first value of initailized int array is:" + numbers2[0]);//10

        //Other correct declarations:
        int[] numbers3 = new int[3];
        int[] numbers4 = new int[3];
        int numbers5[] = new int[3];
        int numbers6[] = new int[3];
        // [] se poate pune orinde dupa int, inainte sau dupa numele variabilei

        int[] numbers7, numbers8;//ambele vor fi arrayour
        int numbers9[], numbers10;//numbers9 va fi int array, numbers10 doar int

        //Array Equality
        //The array is also an object. So the equality will return true only in case of reference equality
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println("bugs == alias?:" + bugs.equals(alias));//true, they have the same reference
        String[] bugs2 = {"cricket", "beetle", "ladybug"};
        System.out.println("bugs == bugs2?:" + bugs.equals(bugs2));//false
        System.out.println(bugs.toString());//will print the address
        System.out.println(Arrays.toString(bugs));//will print the values of the array

        String test[] = new String[2];
        test[0] = "andrei";
        test[1] = "blana";
        System.out.println(test[1]);
    }
}
