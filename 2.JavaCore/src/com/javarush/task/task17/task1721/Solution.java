package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader br1 = new BufferedReader(new FileReader(scanner.nextLine()));
        BufferedReader br2 = new BufferedReader(new FileReader(scanner.nextLine()));
        String string;

        while ((string = br1.readLine()) != null) {
            allLines.add(string);
        }
        while ((string = br2.readLine()) != null) {
            forRemoveLines.add(string);
        }
        scanner.close();
        br1.close();
        br2.close();

        Solution solution = new Solution();

        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

        System.out.println(allLines);
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
