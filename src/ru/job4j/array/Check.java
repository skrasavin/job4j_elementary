package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean datum : data) {
            result = datum == result;
        }
        return result;
    }
}
