package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String s;
        while ((s = reader.readLine()) != null) {
            String[] ss = s.split(" ");
            int j = 0;
            for (int i = 0; i < ss.length; i++) {
                try {
                    Double.parseDouble(ss[i]);
                    j = i;
                    break;
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            String name = "";
            for (int i = 0; i < j; i++) {
                if (i < j - 1) {
                    name += ss[i] + " ";
                } else {
                    name += ss[i];
                }

            }

            Calendar dob = Calendar.getInstance();
            int day = Integer.parseInt(ss[j]);
            int month = Integer.parseInt(ss[j + 1]);
            int year = Integer.parseInt(ss[j + 2]);
            dob.set(year, month - 1, day);

            PEOPLE.add(new Person(name, dob.getTime()));
        }

        reader.close();
    }
}
