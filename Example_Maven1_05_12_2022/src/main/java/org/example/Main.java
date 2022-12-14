package org.example;

//import org.apache.commons.io.FileUtils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
//      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // var - заменяет тип AnnotationConfigApplicationContext

        Parrot p1 = context.getBean("parrot1",Parrot.class); // Вариант
     // Parrot p1 = context.getBean("parrot2",Parrot.class); // Вариант 2 (имя класса)
        System.out.println(p1.getName());

        Parrot p2 = context.getBean("Miki",Parrot.class); // Вариант 2 (название бина)
        System.out.println(p2.getName());

        Parrot p3 = context.getBean(Parrot.class); // Вариант 3
        System.out.println(p3.getName());

        // Программный способ добавления бинов в контекст
        Parrot p4 = new Parrot("hello");
        context.registerBean("hello", Parrot.class, () -> p4);
        Parrot p41 = context.getBean("hello", Parrot.class);
        System.out.println(p41.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

//        Parrot p = new Parrot("qwerty");


//        p.setName("123qwerty");
//        System.out.println(p);

//        System.out.println("Hello friends!");
//        File tempDirectory = FileUtils.getTempDirectory();
//        System.out.println(tempDirectory.getAbsolutePath());
    }
}
