package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sergey Sergeev";
        names[3] = "Petr Petrov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
