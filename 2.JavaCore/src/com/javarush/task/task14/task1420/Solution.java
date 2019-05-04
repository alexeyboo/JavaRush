package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        String s = reader.readLine();
        try {
            a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (a <= 0) throw new IOException();
        int b = 0;
        s = reader.readLine();
        try {
            b = Integer.parseInt(s);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (b <= 0) throw new IOException();

        for (int i = a; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)){
                System.out.println(i);
                break;
            }
        }
    }
}
