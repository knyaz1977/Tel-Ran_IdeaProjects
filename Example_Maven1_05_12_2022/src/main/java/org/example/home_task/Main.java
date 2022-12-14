package org.example.home_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
// Добавить в контекст бины и связать их несколькими способами:
// объект класса Reader связан с объектом класса Book. Но книга
// еще имеет автора - это третий класс. Достаточно продемонстрировать
// на одной книге, одном читателе и одном авторе.
    public static void main(String[] args) {
      //var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Book book = context.getBean("book", Book.class);
        Author author = context.getBean("author", Author.class);
        Reader reader = context.getBean("reader", Reader.class);
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getTitle());
        System.out.println(reader.getName());
        System.out.println(reader.getBook().getTitle());



    }
}
