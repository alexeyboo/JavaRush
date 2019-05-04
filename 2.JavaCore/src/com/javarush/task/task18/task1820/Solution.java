package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File(scanner.nextLine());
        File file2 = new File(scanner.nextLine());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        FileReader fileReader1 = new FileReader(file1);
        BufferedReader reader = new BufferedReader(fileReader1);
        List<String> doubles = new ArrayList<>();

        doubles = Arrays.asList(reader.readLine().split(" "));

        for (String aDouble : doubles) {
            writer.write(String.valueOf(Math.round(Double.parseDouble(aDouble))));
            writer.write(" ");
        }

        reader.close();
        writer.close();
    }
}
