package ru.job4j.condition;

import java.text.DecimalFormat;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 1, 3, 0);
        System.out.println("result (0, 0) to (2, 0) = " + df.format(result1));
        System.out.println("result (1, 1) to (3, 0) = " + df.format(result2));
    }
}
