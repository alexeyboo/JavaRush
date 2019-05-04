package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        long l = (int) 1234_564_890L;
        //System.out.println("l="+l);
        int x = 0b1000_1100_1010;
        //System.out.println("x="+x);
        double m = (byte) 110_987_654_6299.123_34;
        //System.out.println("m=0"+m);
        float f = l++ + 10 + ++x - (float) m;
        //System.out.println("l="+l);
        //System.out.println("x="+x);
        //System.out.println("m=0"+m);
        l = (long) f / 1000;
        System.out.println(l);
    }
}