package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        switch (args[i + 1]) {
                            case "м":
                                synchronized (allPeople) {
                                    allPeople.add(Person.createMale(args[i], simpleDateFormat.parse(args[i + 2])));
                                    break;
                                }
                            case "ж":
                                synchronized (allPeople) {
                                    allPeople.add(Person.createFemale(args[i], simpleDateFormat.parse(args[i + 2])));
                                    break;
                                }
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        switch (args[i + 2]) {
                            case "м":
                                synchronized (allPeople) {
                                    allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], simpleDateFormat.parse(args[i + 3])));
                                    break;
                                }
                            case "ж":
                                synchronized (allPeople) {
                                    allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], simpleDateFormat.parse(args[i + 3])));
                                    break;
                                }
                        }
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])));
                    }
                    break;
                }

        }
    }
}
