package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int Age;
        private String Sex;
        private String Race;
        private String PlaceOfBirth;
        private Calendar DateOfBirth;
        private String Name;

        public Human(int Age, String Sex, String Race, String PlaceOfBirth, Calendar DateOfBirth, String Name) {
            this.Age = Age;
            this.Sex = Sex;
            this.Race = Race;
            this.PlaceOfBirth = PlaceOfBirth;
            this.DateOfBirth = DateOfBirth;
            this.Name = Name;
        }
        public Human(int Age, String Sex, String Race, String PlaceOfBirth, String Name) {
            this.Age = Age;
            this.Sex = Sex;
            this.Race = Race;
            this.PlaceOfBirth = PlaceOfBirth;
            this.Name = Name;
        }
        public Human(int Age, String Sex, String Race, Calendar DateOfBirth, String Name) {
            this.Age = Age;
            this.Sex = Sex;
            this.Race = Race;
            this.DateOfBirth = DateOfBirth;
            this.Name = Name;
        }
        public Human(int Age, String Sex, Calendar DateOfBirth, String PlaceOfBirth, String Name) {
            this.Age = Age;
            this.Sex = Sex;
            this.PlaceOfBirth = PlaceOfBirth;
            this.DateOfBirth = DateOfBirth;
            this.Name = Name;
        }
        public Human(int Age, String Race, String PlaceOfBirth, String Name, Calendar DateOfBirth) {
            this.Age = Age;
            this.Race = Race;
            this.PlaceOfBirth = PlaceOfBirth;
            this.DateOfBirth = DateOfBirth;
            this.Name = Name;
        }
        public Human(String Sex, String Race, String PlaceOfBirth,String Name) {
            this.Sex = Sex;
            this.Race = Race;
            this.PlaceOfBirth = PlaceOfBirth;
            this.Name = Name;
        }
        public Human(int Age, String PlaceOfBirth, Calendar DateOfBirth, String Name) {
            this.Age = Age;
            this.PlaceOfBirth = PlaceOfBirth;
            this.DateOfBirth = DateOfBirth;
            this.Name = Name;
        }
        public Human(String Name) {
            this.Name = Name;
        }
        public Human(int Age) {
            this.Age = Age;
        }
        public Human(int Age, String Name) {
            this.Age = Age;
            this.Name = Name;
        }
    }
}

