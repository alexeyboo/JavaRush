package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanClimb {
        default void climb(){

        }
    }
    public interface CanRun {
        default void run() {

        }
    }
    public interface CanFly {
        default void fly() {

        };
    }
    public class Cat implements CanRun, CanClimb {
    }

    public class Dog implements CanRun {
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
    }
}
