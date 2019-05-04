package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigIntegerArray = InitBigIntegerArray();
        int[] firstSmallIntegerArray = firstDividingIntegerArray(bigIntegerArray);
        int[] secondSmallIntegerArray = secondDividingIntegerArray(bigIntegerArray);
        soutArray(secondSmallIntegerArray);

    }
    public static int[] InitBigIntegerArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static int[] firstDividingIntegerArray(int[] array) {
        int[] firstSmallIntegerArray = new int[10];
        for (int i = 0; i < 10; i++) {
            firstSmallIntegerArray[i] = array[i];
        }
        return firstSmallIntegerArray;
    }
    public static int[] secondDividingIntegerArray(int[] array) {
        int[] secondSmallIntegerArray = new int[10];
        for (int i = 0; i < 10; i++) {
            secondSmallIntegerArray[i] = array[i + 10];
        }
        return  secondSmallIntegerArray;
    }
    public static void soutArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
