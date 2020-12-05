package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int years = 0;
        int sum = 0;
        while (sum < amount) {
            amount *= (percent / 100 + 1);
            sum += salary;
            years += 1;
        }
        return years;
    }
}
