package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> triplen = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> nonen = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                triplen.add(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                even.add(list.get(i));
        }





        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 3 != 0) && (list.get(i) % 2 != 0))
                nonen.add(list.get(i));
        }

        printList(triplen);
        printList(even);
        printList(nonen);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
