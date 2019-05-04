package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
//        String[] split = "Петров Петр Петрович 31 12 1957".split(" ");
//        Person person = null;
//        try {
//            person = new PersonScannerAdapter(new Scanner(System.in)).read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] toParse = fileScanner.nextLine().split(" ");
            Date date = null;
            Calendar calendar = Calendar.getInstance();

            calendar.set(Integer.parseInt(toParse[5]),Integer.parseInt(toParse[4]) - 1, Integer.parseInt(toParse[3]));

            return new Person(toParse[1], toParse[2], toParse[0], calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
