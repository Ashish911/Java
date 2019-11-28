package com.example.LearningJava;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;


public class Datesandtimes {

    public static void main(String[] args){

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2010, 1,05);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate Ld = LocalDate.of(2010,1,05);
        System.out.println(Ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(Ld));
    }
}
