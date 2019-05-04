package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                Date date = simpleDateFormat.parse(args[3]);
                switch (args[2]) {
                    case "м":
                        Person person = Person.createMale(args[1], date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                        break;
                    case "ж":
                        person = Person.createFemale(args[1], date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                        break;
                }
                break;
            case "-u":
                date = simpleDateFormat.parse(args[4]);
                switch (args[3]) {
                    case "м":
                        Person person = Person.createMale(args[2], date);
                        allPeople.set(Integer.parseInt(args[1]), person);
                        break;
                    case "ж":
                        person = Person.createFemale(args[2], date);
                        allPeople.set(Integer.parseInt(args[1]), person);
                        break;
                }
                break;
            case "-d":
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            case "-i":
                System.out.println(allPeople.get(Integer.parseInt(args[1])));
                break;
        }

    }
}
