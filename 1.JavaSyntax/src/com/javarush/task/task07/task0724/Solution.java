package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("1", true, 1));
        people.add(new Human("2", true, 1));
        people.add(new Human("3", true, 1));
        people.add(new Human("4", false, 1));
        people.add(new Human("5", false, 1, people.get(0), people.get(1)));
        people.add(new Human("6", false, 1, people.get(0), people.get(1)));
        people.add(new Human("7", false, 1, people.get(0), people.get(1)));
        people.add(new Human("8", false, 1, people.get(0), people.get(1)));
        people.add(new Human("9", false, 1, people.get(0), people.get(1)));
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}