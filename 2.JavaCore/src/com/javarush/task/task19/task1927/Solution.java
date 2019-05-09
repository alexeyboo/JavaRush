package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream savedStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new MyStream(new PrintStream(outputStream));
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(savedStream);
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class MyStream extends PrintStream {
        private PrintStream printStream;
        private static int count = 0;
        private static String ad = "JavaRush - курсы Java онлайн";

        @Override
        public void print(String s) {
            super.print(s);
            count++;
            if (count % 2 == 0) {
                super.print(System.lineSeparator());
                super.print(ad);
            }
        }

        public MyStream(PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        public MyStream(OutputStream out) {
            super(out);
        }
    }
}
