package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
    private String name;
    private final Book book;

    @Autowired
    public Library(Book book) {
        this.book = book;
        this.name = "City Library";
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }
}
