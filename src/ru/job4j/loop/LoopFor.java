package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }
    }
}