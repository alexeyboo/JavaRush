package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s;

        while (!(s = scanner.nextLine()).equals("exit")) {
            new ReadThread(s).start();
        }

//        System.out.println(resultMap.values().toString());
    }

    public static class ReadThread extends Thread {
        String fileName;
        Map<Integer, Integer> stats = new HashMap<>();

        public ReadThread(String fileName) {
            this.fileName = fileName;
            run();
        }

        @Override
        public void run() {
            File file = new File(fileName);
            try (FileInputStream stream = new FileInputStream(file)){
                while (stream.available() > 0) {
                    putValue(stream.read());
                }

                Integer maxEntry = Collections.max(stats.values());

                for (Integer key : stats.keySet()) {
                    if (stats.get(key).equals(maxEntry)) {
                        resultMap.put(fileName, key);
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void putValue(Integer b){
            if (stats.containsKey(b)) {
                Integer value = stats.get(b);
                value++;
                stats.put(b, value);
            } else {
                stats.put(b, 1);
            }
        }
    }
}
