package org.example.home_task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {

    @Bean("author")
    public Author author() {
        Author author = new Author("John");
        return author;
    }

    @Bean
    public Reader reader(Book book) {
        Reader reader = new Reader();
        reader.setName("Ann");
        reader.setBook(book);
        return reader;
    }

    @Bean("book")
    public Book book(Author author) {
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle("qwerty");
        return book;

    }
}
