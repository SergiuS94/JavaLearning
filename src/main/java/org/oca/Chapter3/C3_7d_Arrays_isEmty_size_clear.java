package org.oca.Chapter3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class C3_7d_Arrays_isEmty_size_clear {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        System.out.println("Is the list empty?");
        System.out.println(birds.isEmpty());//returns true
        System.out.println("Addind hawk");
        birds.add("hawk");
        System.out.println("Is the list empty?");
        System.out.println(birds.isEmpty());//returns false
        System.out.println("Addind hawk");
        birds.add("hawk");
        System.out.println("What is the size of the list?");
        System.out.println(birds);
        System.out.println(birds.size());//returns 2

        System.out.println("Clearing all elements");
        birds.clear();
        System.out.println("Is the list empty?");
        System.out.println(birds.isEmpty());//returns true
        System.out.println("What is the size of the list?");
        System.out.println(birds.size());//returns 0


    }
}
