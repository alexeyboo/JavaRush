package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader1 = new FileReader(reader.readLine());
        FileReader fileReader2 = new FileReader(reader.readLine());
        reader.close();
        BufferedReader reader1 = new BufferedReader(fileReader1);
        BufferedReader reader2 = new BufferedReader(fileReader2);
        ArrayList<String> arrayList1 = readFile(reader1);
        ArrayList<String> arrayList2 = readFile(reader2);
        reader1.close();
        reader2.close();

        while (arrayList1.size() > 0 && arrayList2.size() > 0) {
            if (arrayList1.get(0).equals(arrayList2.get(0))) {
                lines.add(new LineItem(Type.SAME, arrayList1.get(0)));
                arrayList1.remove(0);
                arrayList2.remove(0);
            } else if (arrayList1.get(0).equals(arrayList2.get(1))) {
                lines.add(new LineItem(Type.ADDED, arrayList2.get(0)));
                arrayList2.remove(0);
            } else if (arrayList2.get(0).equals(arrayList1.get(1))) {
                lines.add(new LineItem(Type.REMOVED, arrayList1.get(0)));
                arrayList1.remove(0);
            }
        }

        if(arrayList1.size() == 0 && arrayList2.size() == 1){
            lines.add(new LineItem(Type.ADDED, arrayList2.get(0)));
            arrayList2.remove(0);
        }
        if(arrayList1.size() == 1 && arrayList2.size() == 0){
            lines.add(new LineItem(Type.REMOVED, arrayList1.get(0)));
            arrayList2.remove(0);
        }

//        System.out.println(lines);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }

    private static ArrayList<String> readFile(BufferedReader reader) throws IOException {
        String s;
        ArrayList<String> result = new ArrayList<>();
        while((s = reader.readLine()) != null) {
            result.add(s);
        }

        return result;
    }
}
