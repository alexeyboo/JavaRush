package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = new Scanner(System.in).nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        List<Data> data = new ArrayList<>();
        String s;

        while ((s = reader.readLine()) != null) {
            data.add(saveData(s));
        }
        reader.close();
        if (args.length > 0) {
            switch (args[0]) {
                case "-u":
                    for (Data datum : data) {
                        if (datum.getId().equals(args[1])) {
                            datum.setProductName(args[2]);
                            datum.setPrice(args[3]);
                            datum.setQuantity(args[4]);
                            break;
                        }
                    }
                    break;
                case "-d":
                    Data toDelete = null;

                    for (Data datum : data) {
                        if (datum.getId().equals(args[1])) {
                            toDelete = datum;
                            break;
                        }
                    }

                    data.remove(toDelete);
                    break;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            for (int i = 0; i < data.size(); i++) {
                writer.write(data.get(i).toString());
                writer.newLine();
            }
            writer.close();
        }
    }

    private static Data saveData(String s) {
        Data data = new Data();
        data.setId(s.substring(0, 8));
        data.setProductName(s.substring(8, 38));
        data.setPrice(s.substring(38, 46));
        data.setQuantity(s.substring(46, s.length()));

        return data;
    }

    private static class Data {
        String id;
        String productName;
        String price;
        String quantity;

        public String getId() {
            return id.trim();
        }

        public String getProductName() {
            return productName.trim();
        }

        public String getPrice() {
            return price.trim();
        }

        public String getQuantity() {
            return quantity.trim();
        }

        public void setId(String id) {
            this.id = id.trim();
        }

        public void setProductName(String productName) {
            this.productName = productName.trim();
        }

        public void setPrice(String price) {
            this.price = price.trim();
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity.trim();
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(id);
            if (builder.length() < 8) {
                for (int i = builder.length(); i < 8; i++) {
                    builder.append(" ");
                }
            } else {
                builder.delete(8, builder.length());
            }
            builder.append(productName);
            if (builder.length() < 38) {
                for (int i = builder.length(); i < 38; i++) {
                    builder.append(" ");
                }
            } else {
                builder.delete(38, builder.length());
            }
            builder.append(price);
            if (builder.length() < 46) {
                for (int i = builder.length(); i < 46; i++) {
                    builder.append(" ");
                }
            } else {
                builder.delete(46, builder.length());
            }
            builder.append(quantity);
            if (builder.length() < 50) {
                for (int i = builder.length(); i < 50; i++) {
                    builder.append(" ");
                }
            } else {
                builder.delete(50, builder.length());
            }
            return builder.toString();
        }
    }
}
