package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max1 = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int max2 = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if ((int)list.get(j) == (int)list.get(i)) {
                    max2++;
                    if (max2 > max1) {
                        max1 = max2;
                    }
                } else {
                    if (max2 > max1) {
                        max1 = max2;
                    }
                    break;
                }
            }

        }
        System.out.println(max1);
    }
}