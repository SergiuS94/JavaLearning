package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C3_8d_Dates_And_Times_Formating {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("The date is:" + date);
        System.out.println("Its year is:" + date.getYear());
        System.out.println("Its month is:" + date.getMonth());
        System.out.println("Its day is:" + date.getDayOfYear());
        System.out.println();

        LocalTime time = LocalTime.of(11, 12, 34);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println();
        DateTimeFormatter shortDateTIme = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("The short format of the entire dateTime is:" + shortDateTIme.format(dateTime));
        System.out.println("The short format of the date is:" + shortDateTIme.format(date));
        System.out.println("Same result as previous formating if we use .format(shortDateTime)");
        System.out.println(dateTime.format(shortDateTIme));
        System.out.println(date.format(shortDateTIme));

    }


}
