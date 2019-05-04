package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = new Scanner(System.in).nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        int maxId = Integer.MIN_VALUE;
        int productNameIndex = 8;
        int priceIndex = 38;
        int quantityIndex = 46;
        List<Character> nums = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            nums.add(i);
        }
        String s;

        while ((s = reader.readLine()) != null && !s.equals("")) {
            StringBuilder buf = new StringBuilder(s.substring(0, productNameIndex));
            for (int i = 0; i < buf.length(); i++) {
                if (!nums.contains(buf.charAt(i))) {
                    buf.deleteCharAt(i);
                    i--;
                }
            }

            if (Integer.parseInt(buf.toString()) > maxId) {
                maxId = Integer.parseInt(buf.toString());
            }
        }

        reader.close();

        if (args.length > 0) {
            if ("-c".equals(args[0])) {
                StringBuilder builder = new StringBuilder();
                builder.append(++maxId);
                if (builder.length() < productNameIndex) {
                    for (int i = builder.length(); i < productNameIndex; i++) {
                        builder.append(" ");
                    }
                } else {
                    builder.delete(productNameIndex, builder.length());
                }
                builder.append(args[1]);
                if (builder.length() < priceIndex) {
                    for (int i = builder.length(); i < priceIndex; i++) {
                        builder.append(" ");
                    }
                } else {
                    builder.delete(priceIndex, builder.length());
                }
                builder.append(args[2]);
                if (builder.length() < quantityIndex) {
                    for (int i = builder.length(); i < quantityIndex; i++) {
                        builder.append(" ");
                    }
                } else {
                    builder.delete(quantityIndex, builder.length());
                }
                builder.append(args[3]);
                if (builder.length() < 50) {
                    for (int i = builder.length(); i < 50; i++) {
                        builder.append(" ");
                    }
                } else {
                    builder.delete(50, builder.length());
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));
                writer.newLine();
                writer.write(builder.toString());
                writer.close();
            }
        }
    }
}
