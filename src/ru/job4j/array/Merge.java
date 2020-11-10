package ru.job4j.array;

import ru.job4j.condition.Max;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indL = 0;
        int indR = 0;
        int indRSL = 0;
        while (indL < left.length && indR < right.length) {
            if (left[indL] < right[indR]) {
                rsl[indRSL] = left[indL++];
            } else {
                rsl[indRSL] = right[indR++];
            }
            indRSL++;
        }
        while (indL < left.length) {
            rsl[indRSL++] = left[indL++];
        }
        while (indR < right.length) {
            rsl[indRSL++] = right[indR++];
        }
        return rsl;
    }
}