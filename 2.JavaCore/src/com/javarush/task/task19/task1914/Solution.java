package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);
        String expression = outputStream.toString();
        String[] s = expression.split(" ");
        int first = Integer.parseInt(s[0]);
        int second = Integer.parseInt(s[2]);
        switch (s[1]) {
            case "+":
                s[3] = first + second + "";
                break;
            case "-":
                s[3] = first - second + "";
                break;
            case "*":
                s[3] = first * second + "";
                break;
        }

        System.out.println(expression + s[3]);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

