package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        FileOutputStream fileOutputStream = new FileOutputStream(scanner.nextLine());
        byte[] buffer1 = new byte[fileInputStream.available()];
        byte[] buffer2 = new byte[fileInputStream.available()];

        fileInputStream.read(buffer1);
        for (int i = 0; i < buffer1.length; i++) {
            buffer2[buffer1.length - 1 - i] = buffer1[i];
        }

        fileOutputStream.write(buffer2);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
