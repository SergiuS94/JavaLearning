package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class C3_8c_Dates_And_Times_Exercises2 {

    /**In order to reuse the code, we'll like to set the period that will be used to change the toys. For that we have a variable type Period */

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.JANUARY, 23);
        LocalDate end = LocalDate.of(2022, Month.OCTOBER, 20);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end,period);

        //ex of other periods
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyYearAndWeek = Period.of(1,0,7);//every 1 year and 7 days

        //wrong
        Period ofWeek = Period.ofYears(1).ofWeeks(1);//of week will overwrite years

    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
