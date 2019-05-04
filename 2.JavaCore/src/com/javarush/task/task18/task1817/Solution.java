package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int c;
        int spaces = 0;
        int notSpaces = 0;
        while ((c = fileReader.read()) != -1) {
            if ((char)c == ' ') {
                spaces++;
            } else {
                notSpaces++;
            }
        }

        System.out.printf("%.2f", (double) 100 * spaces / (spaces + notSpaces));
        fileReader.close();
    }
}
