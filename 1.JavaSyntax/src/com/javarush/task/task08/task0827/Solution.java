package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException{

        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2013"));
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = sdf.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        if (cal.get(Calendar.DAY_OF_YEAR) % 2  == 1) return true;
        else
            return false;
    }
}
