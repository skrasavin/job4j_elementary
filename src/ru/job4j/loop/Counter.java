package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(1, 5));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 18));
        System.out.println(" ");
        System.out.println("byEven");
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));

    }
}