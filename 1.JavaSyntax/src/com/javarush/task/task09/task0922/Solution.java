package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf1 = new SimpleDateFormat("y-MM-dd", Locale.ENGLISH);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        Date date = sdf1.parse(reader.readLine());
        System.out.println(sdf2.format(date).toUpperCase());

    }
}
