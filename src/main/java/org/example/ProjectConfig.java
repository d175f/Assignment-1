package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Primary
    public Book book1() {
        Book book = new Book();
        book.setTitle("1984");
        return book;
    }

    @Bean
    public Book book2() {
        Book book = new Book();
        book.setTitle("Harry Potter");
        return book;
    }

    @Bean
    public Book book3() {
        Book book = new Book();
        book.setTitle("War and Peace");
        return book;
    }

    @Bean
    public Library library() {
        Library library = new Library();
        library.setName("City Library");
        library.setBook(book2());
        return library;
    }
}
