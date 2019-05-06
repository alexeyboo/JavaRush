package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        String s;
        while ((s = reader.readLine()) != null) {
            String[] pair = s.split(" ");
            if (!map.containsKey(pair[0])) {
                map.put(pair[0], Double.valueOf(pair[1]));
            } else {
                double buf = map.get(pair[0]);
                buf += Double.valueOf(pair[1]);
                map.put(pair[0], buf);
            }
        }
        reader.close();

        Double max = Collections.max(map.values());
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
