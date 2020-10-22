package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        String[] arr = array.clone();
                        array[index] = arr[i];
                        array[i] = arr[index];
                        break;
                    }
                }
            }
        }
        return array;
    }
}