package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        int res = Max.max(6, 7);
        System.out.println(res);
        res = Max.max(6, 7, 8);
        System.out.println(res);
        res = Max.max(6, 7, 8, 9);
        System.out.println(res);
    }
}
