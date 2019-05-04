package com.javarush.task.task18.task1805;



import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        ArrayList arrayList = new ArrayList<Integer>();
        while (fileInputStream.available() > 0) arrayList.add(fileInputStream.read());

        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        scanner.close();
        fileInputStream.close();
    }
}
