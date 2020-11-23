package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indL = 0;
        int indR = 0;
        int indRSL = 0;
        if (left.length == 0) {
            while (indR < right.length) {
                System.out.println(indR);
                rsl[indRSL++] = right[indR++];
            }
        }
        if (right.length == 0) {
            while (indL < left.length) {
                rsl[indRSL++] = left[indL++];
            }
        }
        while (indL < left.length && indR < right.length) {
            rsl[indRSL++] = left[indL] < right[indR] ?  left[indL++] : right[indR++];
            if (indRSL >= left.length || indRSL >= right.length) {
                while (indL < left.length) {
                    rsl[indRSL++] = left[indL++];
                }
                while (indR < right.length) {
                    rsl[indRSL++] = right[indR++];
                }
            }
        }
        return rsl;
    }
}