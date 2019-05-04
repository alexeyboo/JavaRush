package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Set<Character> alphabet = new HashSet<>();

        for(char c = 'a'; c <= 'z'; ++c) {
            alphabet.add(c);
        }

        for(char c = 'A'; c <= 'Z'; ++c) {
            alphabet.add(c);
        }


        File file = new File(args[0]);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        int num = 0;

        while ((s = bufferedReader.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (alphabet.contains(s.charAt(i))) {
                    num++;
                }
            }
        }

        bufferedReader.close();
        System.out.println(num);
    }
}
