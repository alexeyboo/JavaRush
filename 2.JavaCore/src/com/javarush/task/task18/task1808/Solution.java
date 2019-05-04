package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(scanner.nextLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(scanner.nextLine());
        byte[] buffer;
        buffer = new byte[fileInputStream.available()];
        int count = fileInputStream.read(buffer);
        System.out.println(count / 2);
        fileOutputStream1.write(buffer, 0, (int) Math.round((double)count / 2));
        fileOutputStream2.write(buffer, (int) Math.round((double)count / 2), count / 2);
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
