package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        s.add(reader.readLine());
        SimpleDateFormat m = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Date date = m.parse(s.get(0));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(s.get(0) + " is the " + (cal.get(Calendar.MONTH) + 1) + " month");
    }
}
