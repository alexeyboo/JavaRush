package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> x = new ArrayList<>();
        int i = 0;

            while (true) {
                try {
                    x.add(Integer.parseInt(reader.readLine()));
                } catch (NumberFormatException e) {
                    for (int j = 0; j < i; j++) {
                        System.out.println(x.get(j));
                    }
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                i++;
            }

    }
}
