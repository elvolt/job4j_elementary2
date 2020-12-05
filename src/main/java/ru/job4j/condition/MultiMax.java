package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
}
