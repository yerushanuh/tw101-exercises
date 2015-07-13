package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books) {
        this(books, System.out);
    }

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                printStream.println(books[i]);
            }
        }

        return null;
    }
}
