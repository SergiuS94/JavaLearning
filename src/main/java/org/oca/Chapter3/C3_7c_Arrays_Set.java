package org.oca.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class C3_7c_Arrays_Set {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds);
        birds.set(0,"robin");
        System.out.println("after changing the element 0");
        System.out.println(birds);
        System.out.println("After changing an element of an id that doesn't exist");
        birds.set(1,"not working");//indexOutOfBoundsException
    }
}
