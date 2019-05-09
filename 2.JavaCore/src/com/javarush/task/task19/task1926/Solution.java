package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(s));

        while ((s = reader.readLine()) != null) {
            StringBuilder ss = new StringBuilder(s);
            ss.reverse();
            System.out.println(ss);
        }

        reader.close();
    }
}
