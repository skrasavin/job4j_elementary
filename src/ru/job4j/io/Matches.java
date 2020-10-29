package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int numberOfMatches = 11;
        int numberOfMove = 0;
        boolean play = true;
        while (play) {
            if (numberOfMove % 2 == 0) {
                System.out.print("Игрок 1 делает ход: ");
                int player1 = Integer.parseInt(new Scanner(System.in).nextLine());
                while (player1 <= 0 || player1 >= 4) {
                    System.out.print("Введите цифру от 1 до 3: ");
                    player1 = Integer.parseInt(new Scanner(System.in).nextLine());
                }
                numberOfMatches -= player1;

            } else {
                System.out.print("Игрок 2 делает ход: ");
                int player2 = Integer.parseInt(new Scanner(System.in).nextLine());
                while (player2 <= 0 || player2 >= 4) {
                    System.out.print("Введите цифру от 1 до 3: ");
                    player2 = Integer.parseInt(new Scanner(System.in).nextLine());
                }
                numberOfMatches -= player2;
            }

            System.out.println("Спичек на столе: " + numberOfMatches + "\n");
            if (numberOfMatches <= 0) {
                System.out.print("Игра окончена - ");
                if (numberOfMove % 2 == 0) {
                    System.out.println("Выигрывает Игрок1");
                } else {
                    System.out.println("Выигрывает Игрок2");
                }
                play = false;
            }

            numberOfMove++;
        }
    }

}
