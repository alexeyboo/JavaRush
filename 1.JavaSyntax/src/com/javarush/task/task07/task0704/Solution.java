package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] IntegerArray = initIntegerArray();
        reverseoutputIntegerArray(IntegerArray);
    }
    public static int[] initIntegerArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static void reverseoutputIntegerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[9 - i]);
        }
    }
}

