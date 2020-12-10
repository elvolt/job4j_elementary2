package ru.job4j.pojo;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 1200);
        Book book2 = new Book("Clean Code", 500);
        Book book3 = new Book("Batman", 450);
        Book book4 = new Book("HTML for dummies", 1234);
        Book[] books = {book1, book2, book3, book4};
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book book : books) {
            System.out.println(book.getName());
        }
        System.out.println();
        System.out.println("CLEAN CODE BOOKS");
        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
