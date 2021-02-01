package job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int numberOfMatches = 11;
        int numberOfMove = 0;
        while (numberOfMatches > 0) {
            if (numberOfMove % 2 == 0) {
                System.out.print("Игрок 1 делает ход: ");
            } else {
                System.out.print("Игрок 2 делает ход: ");
            }

            int player = Integer.parseInt(new Scanner(System.in).nextLine());
            while (player <= 0 || player >= 4) {
                System.out.print("Введите цифру от 1 до 3: ");
                player = Integer.parseInt(new Scanner(System.in).nextLine());
            }
            numberOfMatches -= player;

            System.out.println("Спичек на столе: " + numberOfMatches + "\n");
            numberOfMove++;
        }

        System.out.print("Игра окончена - ");
        if (numberOfMove % 2 != 0) {
            System.out.println("Выигрывает Игрок1");
        } else {
            System.out.println("Выигрывает Игрок2");
        }
    }
}
