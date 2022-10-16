import java.util.Comparator;

public class User implements Comparator<User> {
    //    int getAge;
    String john;
    int age;

    public User(String john, int age) {
        this.john = john;
        this.age = age;
    }

    public int getAge() {
        return 0;
    }
//    new Comparator<User>()

    @Override
    public String toString() {
        return "User{" +
                "john='" + john + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(User o1, User o2) {
        return 0;
    }


//    @Override
//    public int compare(User o1, User o2) {
//        return o1.getAge() - o2.getAge();
//    }
}
