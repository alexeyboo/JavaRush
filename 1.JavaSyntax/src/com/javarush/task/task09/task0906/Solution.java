package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (int i = 0; i < ste.length; i++) {
            if (ste[i].getMethodName().equals("log")) {
                System.out.println(ste[i + 1].getClassName() + ": " + ste[i + 1].getMethodName() + ": " + s);
            }
        }
    }
}
