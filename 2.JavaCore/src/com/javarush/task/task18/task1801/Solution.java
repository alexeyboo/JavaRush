package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        int minbyte = Integer.MIN_VALUE;
        while (fileInputStream.available() > 0) {
            int buf;
            if ((buf = fileInputStream.read()) > minbyte)
                minbyte = buf;
        }
        System.out.println(minbyte);
        fileInputStream.close();
        scanner.close();
    }
}
