package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        while (bufferedReader.ready()) {
            content.append(bufferedReader.readLine());
        }
        bufferedReader.close();

        StringBuilder text = new StringBuilder(content.toString().replaceAll("\r\n", ""));

        String tagOpen = "<" + args[0];
        String tagClose = "</" + args[0] + ">";

        int positionOpen;
        int positionClose;
        int shift = -1;
        Stack<Integer> openedTags = new Stack<>();
        Map<Integer, Integer> tags = new TreeMap<>();
        while (true) {
            positionOpen = text.indexOf(tagOpen, shift);
            positionClose = text.indexOf(tagClose, shift);
            if (positionOpen < 0 && positionClose < 0) {
                break;
            }

            if (positionOpen != -1 && positionOpen < positionClose) {
                openedTags.push(positionOpen);
                shift = positionOpen + tagOpen.length();
                continue;
            }

            if (positionClose != -1 && (positionOpen > positionClose || positionOpen == -1)) {
                if (openedTags.isEmpty()) {
                    break;
                }
                tags.put(openedTags.pop(), positionClose + tagClose.length());
                shift = positionClose + tagClose.length();
            }
        }

        for (Map.Entry<Integer, Integer> pair : tags.entrySet()) {
            System.out.println(text.substring(pair.getKey(), pair.getValue()));
        }
    }
}
