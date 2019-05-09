package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(s));
        while ((s = reader.readLine()) != null) {
            String[] words = s.split(" ");
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                Integer num = null;
                try {
                    num = Integer.parseInt(words[i]);
                } catch (NumberFormatException e) {
                    if (i < words.length - 1) {
                        output.append(words[i] + " ");
                    } else {
                        output.append(words[i]);
                    }
                    continue;
                }

                if (num < 13 && num >= 0) {
                    if (i < words.length - 1) {
                        output.append(map.get(num) + " ");
                    } else {
                        output.append(map.get(num));
                    }
                } else {
                    if (i < words.length - 1) {
                        output.append(num + " ");
                    } else {
                        output.append(num);
                    }
                }
            }
            System.out.println(output);
        }
        reader.close();
    }
}
