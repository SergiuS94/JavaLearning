package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C3_8F_Parsing_Dates_And_Times {

    public static void main(String[] args) {

        /**Define the initial format */
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015",f);
        System.out.println(date);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(time);

    }


}
