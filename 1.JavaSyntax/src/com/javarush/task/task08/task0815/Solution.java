package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            String f = "" + i;
            String s = "" + (int)(Math.random() * 3);
            names.put(f, s);
        }
        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int nameCount = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue().equals(name)) nameCount++;
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int lastNameCount = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getKey().equals(lastName)) lastNameCount++;
        }
        return lastNameCount;
    }

    public static void main(String[] args) {

    }
}
