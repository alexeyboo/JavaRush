package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> StringsArray = init();
        Solution a = new Solution();
        a.soutminmax(StringsArray);
    }
    public static ArrayList<String> init() throws IOException {
        ArrayList<String> s = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            s.add(reader.readLine());
        }
        return s;
    }
    public static int max(ArrayList<String> s) {
        int max = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() > max)
                max = s.get(i).length();
        }
        return max;
    }
    public static int min(ArrayList<String> s) {
        int min = s.get(0).length();
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i).length() < min)
                min = s.get(i).length();
        }
        return min;
    }
    public void soutminmax(ArrayList<String> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() == min(s)) {
                System.out.println(s.get(i));
                break;
            } else if (s.get(i).length() == max(s)){
                System.out.println(s.get(i));
                break;
            }
        }
    }
}
