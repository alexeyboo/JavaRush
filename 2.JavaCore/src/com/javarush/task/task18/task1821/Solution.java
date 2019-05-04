package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        List<Character> chars = new ArrayList<>();
        FileInputStream stream = new FileInputStream(file);
        Character line;

        while (stream.available() > 0) {
            chars.add((char)stream.read());
        }

        Map<Character, Integer> map = new TreeMap<>();

        for (Character aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer nextValue = map.get(aChar);
                nextValue++;
                map.put(aChar, nextValue);
            } else map.put(aChar, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        stream.close();
    }
}
