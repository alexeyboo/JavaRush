package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        int maxNumOfRepeats = 0;
        int trueMaxNumOfRepeats = 0;
        ArrayList arrayList = new ArrayList<Integer>();
        ArrayList trueBytes = new ArrayList<Integer>();
        while (fileInputStream.available() > 0) {
            arrayList.add(fileInputStream.read());
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    maxNumOfRepeats++;
                    arrayList.remove(j);
                    j--;
                }
            }
            if (maxNumOfRepeats > trueMaxNumOfRepeats) {
                trueMaxNumOfRepeats = maxNumOfRepeats;
                trueBytes.clear();
                trueBytes.add(arrayList.get(i));
            }
            if ((maxNumOfRepeats == trueMaxNumOfRepeats)&&(!trueBytes.contains(arrayList.get(i))))
                trueBytes.add(arrayList.get(i));
            maxNumOfRepeats = 0;
        }
        for (int i = 0; i < trueBytes.size(); i++) {
            System.out.print(trueBytes.get(i) + " ");
        }
        scanner.close();
        fileInputStream.close();
    }
}
