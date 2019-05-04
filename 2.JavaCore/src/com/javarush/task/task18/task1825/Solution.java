package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        List<String> fileNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fileName;

        while (!(fileName = scanner.nextLine()).equals("end")) {
            fileNames.add(fileName);
        }

        Collections.sort(fileNames);

        fileName = fileNames.get(0).substring(0, fileNames.get(0).lastIndexOf(".part"));
        FileOutputStream outputStream = new FileOutputStream(fileName);
        FileInputStream inputStream;

        for (int i = 0; i < fileNames.size(); i++) {
            inputStream = new FileInputStream(fileNames.get(i));
            byte[] b = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                inputStream.read(b);
                outputStream.write(b);
            }
            inputStream.close();
        }

        outputStream.close();
        scanner.close();
    }
}
