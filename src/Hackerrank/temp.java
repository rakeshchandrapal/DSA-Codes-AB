package Hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        int year = 2022,month = 10,day = 1;
        LocalDate dt = LocalDate.of(year, month, day);
        DayOfWeek date =  dt.getDayOfWeek();
        String str = String.valueOf(date);
        System.out.println(str);
    }
}