package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестные слова - " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        System.out.println(dummy.engToRus("dummy song!"));
    }
}
