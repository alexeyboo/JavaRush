package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        int maxNumOfRepeats = 0;
        int minNumOfRepeats = Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList<Integer>();
        ArrayList trueBytes = new ArrayList<Integer>();
        while (fileInputStream.available() > 0) {
            arrayList.add(fileInputStream.read());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    maxNumOfRepeats++;
                    arrayList.remove(j);
                    j--;
                }
            }
            if (maxNumOfRepeats < minNumOfRepeats) {
                minNumOfRepeats = maxNumOfRepeats;
                trueBytes.clear();
                trueBytes.add(arrayList.get(i));
            }
            if ((maxNumOfRepeats == minNumOfRepeats) && (!trueBytes.contains(arrayList.get(i))))
                trueBytes.add(arrayList.get(i));
            maxNumOfRepeats = 0;
        }


        if (trueBytes.isEmpty()) for (int i = 0; i < arrayList.size(); i++) System.out.print(arrayList.get(i));
        else for (int i = 0; i < trueBytes.size(); i++) {
            System.out.print(trueBytes.get(i) + " ");
        }

        scanner.close();
        fileInputStream.close();
    }
}
