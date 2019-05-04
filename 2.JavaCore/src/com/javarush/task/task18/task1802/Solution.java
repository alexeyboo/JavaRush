package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        int maxbyte = Integer.MAX_VALUE;
        while (fileInputStream.available() > 0) {
            int buf;
            if ((buf = fileInputStream.read()) < maxbyte)
                maxbyte = buf;
        }
        System.out.println(maxbyte);
        fileInputStream.close();
        scanner.close();
    }
}
