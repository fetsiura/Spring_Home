package pl.coderslab.java8;

import java.time.LocalDate;

public class Main05 {

    public static void main(String[] args) {

        //////////////1

        LocalDate todaydate = LocalDate.now();

        System.out.println(todaydate.withDayOfMonth(31).getDayOfWeek());


        ///////////// 2
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.plusDays(7).getDayOfMonth());
        //////////// 3

        LocalDate three = LocalDate.now();

        System.out.println(three.plusMonths(1).withDayOfMonth(1).getDayOfWeek());



    }



}
