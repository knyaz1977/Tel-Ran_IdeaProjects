public class Student {

    private int id; // поле
    private String name; // поле

    public Student(int id, String name) { // конструктор
        this.id = id;
        this.name = name;
    }

    public int getId() { // get - значение
        return id;
    }

    public void setId(int id) { // set -
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) { // instanceof(является ли класс obj классом student).
            // Как читать строку выше - если obj не является объектом класса student
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.id == ((Student) obj).id;
    }

    @Override
    public int hashCode() {
        return id; // переопределили hashCode по id
    }
}