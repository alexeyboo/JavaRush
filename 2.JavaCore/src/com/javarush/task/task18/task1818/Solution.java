package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File(scanner.nextLine());
        File file2 = new File(scanner.nextLine());
        File file3 = new File(scanner.nextLine());
        FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);
        while (fileInputStream2.available() > 0) {
            outputStream1.write(fileInputStream2.read());
        }
        while (fileInputStream3.available() > 0) {
            outputStream1.write(fileInputStream3.read());
        }

        outputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
