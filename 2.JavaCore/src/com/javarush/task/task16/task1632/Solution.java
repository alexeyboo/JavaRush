package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) throws InterruptedException {

        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {

        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

//class MyThread4 extends Thread implements Message {
//    @Override
//    public void run() {
//        while (!Thread.currentThread().isInterrupted()) {
//
//        }
//    }
//
//    @Override
//    public void showWarning() {
//        Thread.currentThread().interrupt();
//    }
//}

class MyThread4 extends Thread implements Message {
    private static volatile boolean myBoolean = true;
    public void run() {
        while (myBoolean) {
        }
    }
    public void showWarning() {
        myBoolean = false;
    }
}
class MyThread5 extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        int i = 0;
        while (b) {
            String s = scanner.nextLine();
            try {
                i += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                if (s.equals("N")) break;
            }
        }
        System.out.println(i);
    }
}