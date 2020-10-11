package ru.job4j.condition;

import java.sql.SQLOutput;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-4);
    }
}
