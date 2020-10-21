package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] k : array) {
            for (int i : k) {
                rsl += i;
            }
        }
        return rsl;
    }
}