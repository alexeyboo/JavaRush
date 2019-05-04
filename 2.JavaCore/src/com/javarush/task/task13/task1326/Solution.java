package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream r = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(r);
        ArrayList<Integer> list = new ArrayList<>();
        Integer s;
        while (scanner.hasNextLine()) {
            s = scanner.nextInt();
            Integer odd = s;
            if (odd % 2 == 0) list.add(odd);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    Integer buf = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, buf);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        reader.close();
        r.close();
        scanner.close();
    }
}
