package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.Month;

public class C3_8b_Dates_And_Times_Exercises {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.JANUARY, 23);
        LocalDate end = LocalDate.of(2022, Month.OCTOBER, 20);
        performAnimalEnrichment(start, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
