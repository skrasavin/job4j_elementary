package ru.job4j.oop.pojo;

public class Library {

    public static void main(String[] args) {
        Book history = new Book("History 20 century", 5);
        Book programming = new Book("Clean code", 23);
        Book math = new Book("Addition", 2);
        Book literature = new Book("theLittlePrice", 31);

        Book[] books = new Book[4];
        books[0] = history;
        books[1] = programming;
        books[2] = math;
        books[3] = literature;

        //for (Book book : books) {
        //    System.out.println(book.getName() + " - " + book.getCount());
        //}

        Book[] test = books.clone();
        books[0] = books[3];
        books[3] = test[0];

        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
