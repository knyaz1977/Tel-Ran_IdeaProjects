import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4_HashSet {

    public static void main(String[] args) {
        Student john1 = new Student(1, "John");
        Student john2 = new Student(1, "John");

        Set<Student> students = new HashSet<>();
        students.add(john1);
        students.add(john2);
        System.out.println("size = " + students.size());
        System.out.println("HashSet contains John = " + students.contains((new Student(1,"John"))));

    }
//        Student student1 = new Student(1, "John");
//        Student student2 = new Student(1, "John");
//        System.out.println("student1 hashcode = " + student1.hashCode());
//        System.out.println("student2 hashcode = " + student2.hashCode());
//        System.out.println("student1.equals(student2) = " + student1.equals(student2));
//    }

}
