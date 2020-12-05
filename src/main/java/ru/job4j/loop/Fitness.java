package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int result = 0;
        while (ivan < nik) {
            result += 1;
            ivan *= 3;
            nik *= 2;
        }
        return result;
    }
}
