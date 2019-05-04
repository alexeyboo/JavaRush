package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(input.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(input.readLine()));
        String s;

        while ((s = reader.readLine()) != null) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '.') {
                    sb.replace(i,i+1, "!");
                }
            }
            writer.write(sb.toString());
            writer.newLine();
        }
        input.close();
        reader.close();
        writer.close();
    }
}
