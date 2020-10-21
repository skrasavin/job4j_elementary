package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean num0 = data[0];
        for (boolean number : data) {
            if (num0 != number) {
                return false;
            }
        }
        return result;
    }
}
