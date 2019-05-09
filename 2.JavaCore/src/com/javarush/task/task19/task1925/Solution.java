package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String s;
        StringBuilder stringBuilder = new StringBuilder();

        while ((s = reader.readLine()) != null) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 6) {
                    stringBuilder.append(words[i] + ",");
                }
            }
        }

        if (stringBuilder.charAt(stringBuilder.length() - 1) == ',') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        writer.write(stringBuilder.toString());

        reader.close();
        writer.close();
    }
}
