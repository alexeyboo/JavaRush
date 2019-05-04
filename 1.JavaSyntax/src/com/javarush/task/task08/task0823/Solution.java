package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0)||(s.charAt(i - 1) == ' ')) ss += Character.toUpperCase(s.charAt(i));
            else ss += s.charAt(i);
        }
        System.out.println(ss);
    }
}
