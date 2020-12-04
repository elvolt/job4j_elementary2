package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollars = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rubles are " + dollars + " dollars");

        // Test rubleToEuro
        int inForEuro = 210;
        int expectedForEuro = 3;
        int outForEuro = Converter.rubleToEuro(inForEuro);
        boolean passedForEuro = expectedForEuro == outForEuro;
        System.out.println("210 rubles are 3 euro. Test result : " + passedForEuro);

        // Test rubleToDollars
        int inForDol = 180;
        int expectedForDol = 3;
        int outForDol = Converter.rubleToDollar(inForDol);
        boolean passedForDollars = expectedForDol == outForDol;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedForDollars);
    }
}
