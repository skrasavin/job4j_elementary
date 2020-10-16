package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int a = 2; a <= number; a++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
