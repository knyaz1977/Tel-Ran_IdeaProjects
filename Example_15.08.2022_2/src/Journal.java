public class Journal implements  Printable {

    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override  // при наличии default-ных методов в интерфейсе необязательно переопределять методы!!!
    public void print() {
        System.out.println(name);
    }
}
