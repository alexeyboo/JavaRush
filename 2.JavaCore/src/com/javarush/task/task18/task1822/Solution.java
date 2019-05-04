package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        File file = new File((new Scanner(System.in)).nextLine());
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s;

        while ((s = reader.readLine()) != null) {
            if (s.split(" ")[0].equals(args[0])) {
                System.out.println(s);
                break;
            }
        }

        reader.close();
    }
}
