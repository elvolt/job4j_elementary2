package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);
        int currentPlayer = 1;
        while (count != 0) {
            System.out.println("Player " + currentPlayer + " введите число от 1 до 3");
            int answer = input.nextInt();
            if (answer > count || answer < 1 || answer > 3) {
                System.out.println("Некорректный ввод. Попробуйте ещё раз");
                continue;
            }
            count -= answer;
            System.out.println("Осталось " + count + " спичек");
            if (count > 0) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
        System.out.println("You win, player " + currentPlayer);
    }
}
