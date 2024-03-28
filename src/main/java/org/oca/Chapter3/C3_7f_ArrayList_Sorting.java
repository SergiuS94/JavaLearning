package org.oca.Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C3_7f_ArrayList_Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(60);
        numbers.add(5);
        System.out.println("Unsorted ArrayList: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

    }
}
