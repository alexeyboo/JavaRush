package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;
            Double i = null;
            try {
                i = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                print(s); continue;
            }
            if (s.contains(".")) print(Double.parseDouble(s));
            else if ((i < 128) && (i > 0)) print((short) Integer.parseInt(s));
            else if ((i <= 0) || (i >= 128)) print(Integer.parseInt(s));
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
