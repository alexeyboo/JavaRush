package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public Solution(List<String> strings) {
        this.strings = strings;
    }

    public static List<String> init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            s.add(reader.readLine());
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        int size = 0;
        strings = new ArrayList<String>();
        strings = init();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > size)
                size = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == size)
                System.out.println(strings.get(i));
        }
    }
}
