package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean rs = false, ls = false;
            String s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'р') rs = true;
                if (s.charAt(j) == 'л') ls = true;
            }
            if ((rs)&&(!ls)) {
                list.remove(i);
                i--;
            }
            if ((!rs)&&(ls)) {
                list.add(i, list.get(i));
                i++;
            }
        }
        return list;
    }
}