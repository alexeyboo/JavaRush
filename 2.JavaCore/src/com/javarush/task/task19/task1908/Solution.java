package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader r = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(reader.readLine());
        BufferedWriter w = new BufferedWriter(fileWriter);
        String s;
        String toWrite = "";

        while ((s = r.readLine()) != null) {
            String[] possibleNumbers = s.split(" ");
            for (String possibleNumber : possibleNumbers) {
                try {
                    toWrite += Integer.parseInt(possibleNumber) + " ";
                } catch (NumberFormatException e) {

                }
            }
        }

        w.write(toWrite);
        r.close();
        w.close();
        reader.close();
    }
}
