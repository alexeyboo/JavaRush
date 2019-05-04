package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String s = "" + i;
            String f = "" + (int)(Math.random() * 100);
            map.put(s, f);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        ArrayList<String> names = new ArrayList<>();
        while (iterator1.hasNext()) {
            names.add(iterator1.next().getValue());
        }
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    removeItemFromMapByValue(map, names.get(i));
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        //Map<String, String> map = createMap();
        //removeTheFirstNameDuplicates(map);
        //System.out.println(map);
    }
}
