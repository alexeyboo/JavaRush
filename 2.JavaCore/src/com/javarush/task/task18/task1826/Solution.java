package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        byte[] b = new byte[inputStream.available()];
        switch (args[0]) {
            case "-e":
                while (inputStream.available() > 0) {
                    inputStream.read(b);
                    for (int i = 0; i < b.length; i++) {
                        b[i]++;
                    }
                    outputStream.write(b);
                }
                break;
            case "-d":
                while (inputStream.available() > 0) {
                    inputStream.read(b);
                    for (int i = 0; i < b.length; i++) {
                        b[i]--;
                    }
                    outputStream.write(b);
                }
                break;
        }

        inputStream.close();
        outputStream.close();
    }
}
