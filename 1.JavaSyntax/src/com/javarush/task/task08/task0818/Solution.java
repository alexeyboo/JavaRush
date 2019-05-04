package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String name = "" + i;
            int salary = (int)(Math.random() * 2000);
            map.put(name, salary);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair: copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }
    public static void removeItemByHisValue(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> pair: map.entrySet()) {

        }
    }
    public static void main(String[] args) {
        //HashMap<String, Integer> map = createMap();
        //removeItemFromMap(map);
        //System.out.println(map);
    }
}