package ru.job4j.condition;

import java.text.DecimalFormat;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + df.format(rsl));
    }
}
