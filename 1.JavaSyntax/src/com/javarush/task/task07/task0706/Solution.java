package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] integerArray = initIntegerArray();
        whoIsStronger(integerArray);
    }
    public static int[] initIntegerArray() throws IOException {
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static void whoIsStronger(int[] array) {
        int even = 0, odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1)
                odd += array[i];
            else even += array[i];
        }
        if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
