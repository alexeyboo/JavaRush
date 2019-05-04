package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader fileReaderReader = new BufferedReader(fileReader);
        String line;
        int count = 0;

        while ((line = fileReaderReader.readLine()) != null) {
            String[] worlds = line.split("\\W");
            for (String world : worlds) {
                if (world.equals("world")) {
                    count++;
                }
            }
//                if ((builder.length() - 4 - i > 1 && i == 0 && builder.subSequence(i, i + 6).equals("world ")) ||
//                   (builder.length() - 4 - i > 1 && i == builder.length() - 6 && builder.subSequence(i, i + 6).equals(" world")) ||
//                   !(builder.length() - 6 - i < 7) && (builder.subSequence(i, i + 7).equals(" world ")) ||
//                   (builder.length() == 5 && builder.toString().equals("world"))) {
//                    count++;
//                }

        }

        reader.close();
        fileReaderReader.close();
        System.out.println(count);
    }
}
