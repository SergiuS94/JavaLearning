package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C3_8e_Dates_And_Times_Formating2 {

    public static void main(String[] args) {

        /**For the exam there are two types of format that we have to learn:SHORT, MEDIUM */
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Current date:" + dateTime);
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Short Format:" + shortF.format(dateTime));
        System.out.println("Medium Format:" + mediumF.format(dateTime));


        /**Define your own format */
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println("\nusing our format(MMMM dd, yyyy, hh:mm) we have:" + f.format(dateTime));

    }


}
