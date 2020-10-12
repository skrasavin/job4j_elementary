package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    // метод notEven(), проверяет, что число нечетное
    public boolean notEven(int num) {
        return !isEven(num);
    }

    // метод notPositive(), проверяет, что число не положительное
    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    // метод notEvenAndPositive(), проверяет, что число нечетное и положительное
    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    // метод evenOrNotPositive(), проверяет, что число четное или не положительное
    public boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }
}
