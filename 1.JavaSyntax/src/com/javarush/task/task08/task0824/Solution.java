package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human kid1 = new Human("Alex", true, new ArrayList<Human>());
        Human kid2 = new Human("Alexi", false, new ArrayList<Human>());
        Human kid3 = new Human("Alexis", true, new ArrayList<Human>());
        Human mother = new Human("Shelly", false, new ArrayList<Human>(Arrays.asList(kid1, kid2, kid3)));
        Human father = new Human("Bob", true, new ArrayList<Human>(Arrays.asList(kid1, kid2, kid3)));
        Human grandmother1 = new Human("Sally", false, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandfather1 = new Human("Richard", true, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother2 = new Human("Amelia", false, new ArrayList<Human>(Arrays.asList(father)));
        Human grandfather2 = new Human("Chris", true, new ArrayList<Human>(Arrays.asList(father)));
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(grandfather2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, ArrayList<Human> childen) {
            this.name = name;
            this.sex = sex;
            this.children = childen;
        }
        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
