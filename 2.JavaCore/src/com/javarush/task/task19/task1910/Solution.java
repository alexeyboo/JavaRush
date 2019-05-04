package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()));
        String s;

        while ((s = reader.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                s = s.replaceAll("[^a-zA-Z0-9 ]", "");
            }
            writer.write(s);
            writer.newLine();
        }

        br.close();
        reader.close();
        writer.close();
    }
}
