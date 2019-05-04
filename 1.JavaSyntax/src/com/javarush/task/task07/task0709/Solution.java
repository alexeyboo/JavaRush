package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = init();
        whoIsShorter(strings);
        //напишите тут ваш код
    }
    public static ArrayList<String> init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        return strings;
    }
    public static void whoIsShorter(ArrayList<String> a) {
        int min = a.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (a.get(i).length() < min)
                min = a.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (a.get(i).length() == min)
                System.out.println(a.get(i));
        }
    }
}
