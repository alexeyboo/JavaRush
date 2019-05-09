package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(s));

        String line;
        int count;

        while ((line = reader.readLine()) != null) {
            count = 0;
            for (String s1 : line.split(" ")) {
                if (words.contains(s1)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
