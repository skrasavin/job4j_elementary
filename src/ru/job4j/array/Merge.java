package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
            for (int i = 0; i < rsl.length; i++) {
                rsl[i] = i < left.length ? left[i] : right[i - left.length];
            }
        Arrays.sort(rsl);
        return rsl;
    }
}