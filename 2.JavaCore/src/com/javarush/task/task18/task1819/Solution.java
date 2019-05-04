package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File(scanner.nextLine());
        File file2 = new File(scanner.nextLine());
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        List<Integer> list = new ArrayList<>();
        while (fileInputStream1.available() > 0) {
            list.add(fileInputStream1.read());
        }

        byte[] b = new byte[1000];

        while (fileInputStream2.available() > 0) {
            int count = fileInputStream2.read(b);
            fileOutputStream1.write(b, 0, count);
        }

        for (Integer toWrite : list) {
            fileOutputStream1.write(toWrite);
        }

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
