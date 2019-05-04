package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayString = initStringArray();
        int[] arrayInteger = initIntegerArray(arrayString);
        outputIntegerArray(arrayInteger);

    }
    public static String[] initStringArray() throws IOException {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        return array;
    }
    public static int[] initIntegerArray(String[] arrayString) throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayString[i].length();
        }
        return array;
    }
    public static void outputIntegerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
