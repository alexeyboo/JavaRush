package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String name;
        String s = "";
        @Override
        public void setFileName(String fullFileName) {
            name = fullFileName;
        }

        @Override
        public String getFileContent() {
            return s;
        }

        @Override
        public void run() {
            BufferedReader reader1 = null;
            try {
                reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                while (reader1.ready()) {
                    s += reader1.readLine() + " ";
                }
            } catch (IOException e) {

            }
        }
    }


    //add your code here - добавьте код тут
}
