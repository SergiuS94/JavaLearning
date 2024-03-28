package org.oca.Chapter4._02StaticMethods._06StaticImports;

//import static java.util.Arrays; //->Doesn't compile because we use a static import to import a class
//import java.util.Arrays;//->A class can be imported if it is not static.
/**STATIC IMPORTS are only for importing static members, we can't import a class */
//static import java.util.Arrays.*; //->The order is important, the keyword static is after import

import static java.util.Arrays.asList;
public class _01_StaticImport {

    public static void main(String[] args) {
        asList("one");
//        Arrays.asList("one"); //not working because we dont have Arrays class imported
    }


}
