package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Library library = context.getBean(Library.class);
        Book book = library.getBook();

        System.out.println("Library name: " + library.getName());
        System.out.println("Available book: " + book.getTitle());

        context.close();
    }
}
