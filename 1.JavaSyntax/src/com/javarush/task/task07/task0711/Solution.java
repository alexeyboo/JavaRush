package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringArray = init();
        sort(stringArray);
        for (int i = 0; i < 5; i++) {
            System.out.println(stringArray.get(i));
        }
    }
    public static ArrayList<String> init() throws IOException {
        ArrayList<String> stringArray = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            stringArray.add(reader.readLine());
        }
        return stringArray;
    }
    public static void sort(ArrayList<String> s) {
        String str;
        for (int i = 0; i < 13; i++) {
            str = s.get(4);
            s.remove(4);
            s.add(0, str);
        }
    }
}
