package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int i = array.length / 2;
        for (; i < array.length; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        return array;
    }
}