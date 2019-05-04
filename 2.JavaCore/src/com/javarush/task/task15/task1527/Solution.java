package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String parameterValue = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                String parameter = "";
                String parameterName = "";
                //перебираем символы строки
                for (int j = i + 1; j < s.length(); j++) {
                    //находим разделитель &
                    if (s.charAt(j) == '&') {
                        if (parameter.contains("obj")) {
                            for (int k = 4; k < parameter.length(); k++) {
                                parameterValue += parameter.charAt(k);
                            }
                            parameterName = "obj";
                        } else if (parameter.contains("=")) {
                            for (int k = 0; k < parameter.indexOf("="); k++) {
                                parameterName += parameter.charAt(k);
                            }
                        } else parameterName = parameter;
                        System.out.print(parameterName + " ");
                        parameterName = parameter = "";
                    } else if (j == s.length() - 1) {
                        parameter += s.charAt(j);
                        if (parameter.contains("obj")) {
                            for (int k = 4; k < parameter.length(); k++) {
                                parameterValue += parameter.charAt(k);
                            }
                            parameterName = "obj";
                        } else if (parameter.contains("=")) {
                            for (int k = 0; k < parameter.indexOf("="); k++) {
                                parameterName += parameter.charAt(k);
                            }
                        } else parameterName = parameter;
                        System.out.print(parameterName);
                    } else {
                        parameter += s.charAt(j);
                    }
                }
                break;
            }
        }
        System.out.println();
        if (!parameterValue.isEmpty()) {
            try {
                Double d = Double.parseDouble(parameterValue);
                alert(d);
            } catch (NumberFormatException e) {
                alert(parameterValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}



