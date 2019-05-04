package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream input = new FileInputStream(reader.readLine());
        while (input.available() > 0) {
            char c = (char)input.read();
                System.out.print(c);
        }
        input.close();
        reader.close();
    }
}