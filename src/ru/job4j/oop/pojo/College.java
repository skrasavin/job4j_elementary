package ru.job4j.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setSurname("Ivanov");
        first.setName("Ivan");
        first.setPatronymic("Petrovich");
        first.setGroup(334);
        first.setReceiptDate(new Date());

        System.out.println("Student: " + first.getSurname() + " " + first.getName() + " " + first.getPatronymic()
                            + System.lineSeparator()
                            + "Group Number: " + first.getGroup()
                            + System.lineSeparator()
                            + "Receipt Date: " + first.getReceiptDate()
                );

    }
}
