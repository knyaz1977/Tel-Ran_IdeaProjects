import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        Student john = new Student(1, "john");
        List<Student> studentList = new ArrayList<>();
        studentList.add(john);

        System.out.println("size = " + studentList.size());
        System.out.println("ArrayList contains John = " + studentList.contains(new Student(1, "John")));
    }
}
