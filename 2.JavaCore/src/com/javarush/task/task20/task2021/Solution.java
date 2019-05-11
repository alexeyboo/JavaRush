package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        void readObject(ObjectInputStream ois) throws NotSerializableException {
            throw new NotSerializableException();
        }
        void writeObject(ObjectOutputStream oos) throws NotSerializableException {
            throw new NotSerializableException();
        }

    }

    public static void main(String[] args) {

    }
}
