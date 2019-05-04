package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        int numcopy = numSeconds;

        public void run() {
            while (!currentThread().isInterrupted()) {
                try {
                    if (numSeconds != 0) {
                        System.out.print(numSeconds-- + " ");
                    } else if (numSeconds == 0) {
                        System.out.print("Марш!");
                    }
                    sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    if (numcopy - numSeconds >= 3.5) {
                        System.out.println("Прервано!");
                    }
                }
            }
        }
    }
}
