public class Account<T> implements Accountable<T> { // T универсальный параметр, универсальный тип

    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {

        return id;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {

        return sum;
    }
}
