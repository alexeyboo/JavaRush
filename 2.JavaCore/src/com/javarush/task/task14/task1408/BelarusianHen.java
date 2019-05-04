package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }
}
