package org.oca.Chapter4._02StaticMethods._04FinalKeyword;

import java.util.ArrayList;

public class FinalKeyword {

    /**A convention for constant variables(final) is that we write them with capital letters, and we separate the words using '_'
     * A Final variable must be initialized!, see next package(Static Initialization)
    */

    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println(NUM_BUCKETS);
//        NUM_BUCKETS = 5;          //DOESN'T COMPILE, Final means we cant change the value in this case.


        values.add("test");         //Does compile. WHY? value is a reference variable. We are allowed to call methods on reference variables
                                    //All the compiler can do is check that we don' try to reassign the final values to point to a different object
//        values = new ArrayList<>(); //Does not compile, we change the location this object points to


    }



}
