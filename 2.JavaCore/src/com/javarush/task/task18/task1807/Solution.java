package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44) count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
