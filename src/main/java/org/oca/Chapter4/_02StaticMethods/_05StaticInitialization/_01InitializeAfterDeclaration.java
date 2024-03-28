package org.oca.Chapter4._02StaticMethods._05StaticInitialization;

public class _01InitializeAfterDeclaration {
//    private static final int DOES_NOT_COMPILE;    DOES NOT COMPILE because is not initialized
    private static final int NUM_SECONDS_PER_HOUR;  //Compiles, because the static initializer runs when the class is first used

    static{
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }



}
