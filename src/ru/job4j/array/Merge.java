package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
            for (int i = 0; i < rsl.length; i++) {
                rsl[i] = i < left.length ? left[i] : right[i - left.length];
            }
        return rsl;
    }
}