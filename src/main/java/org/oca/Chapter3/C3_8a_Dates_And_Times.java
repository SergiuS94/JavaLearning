package org.oca.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C3_8a_Dates_And_Times {

    public static void main(String[] args) {
        System.out.println("The Local Date is:" + LocalDate.now());
        System.out.println("The Local Time is:" + LocalTime.now());
        System.out.println("The Local Date and Time is:" + LocalDateTime.now());

        //creating a new date
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        //crating new time
        LocalTime time1 = LocalTime.of(6, 15);//hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30);//hour, minute and seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 500);//hour,minute,second and nanoseconds

        //creating datetime
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.OCTOBER, 22, 20, 6);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time3);
        System.out.println(dateTime2);

        /**Local date is static, you can't use new LocalDate */
        //LocalDate.of(2015,Month.JANUARY,32)//throws datetime exception 32>31

        /**Manipulating dates */
        System.out.println("\n");
        System.out.println("Starting date:" + date1);
        date1 = date1.plusDays(3);
        System.out.println("After adding 3 days:" + date1);
        date1 = date1.plusWeeks(1);
        System.out.println("After adding 1 week:" + date1);
        //same for month and years
        date1  = date1.minusMonths(1);
        System.out.println("After decreasing with 1 month:" + date1);
        //for time or datetime you can use minus hours/minutes/seconds/ns

    }


}
