package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int firstStep = first  > second ? first : second;
        int secondStep = second > third ? second : third;
        return firstStep > secondStep ? firstStep : secondStep;
    }
}
