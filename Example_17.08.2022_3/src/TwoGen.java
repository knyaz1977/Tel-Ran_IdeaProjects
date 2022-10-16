public class TwoGen <T, V>{ // обобщенные типы могут обозначаться любыми буквами(принято T).

    T obj1;
    V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showTypes() {
        System.out.println("Type T: " + obj1.getClass().getName()); // getClass().getName() по умолчанию от object
        System.out.println("Type T: " + obj2.getClass().getName());
    }
}
