package task2;

//import org.apache.commons.io.FileUtils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // var - заменяет тип AnnotationConfigApplicationContext
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());







    }
}
