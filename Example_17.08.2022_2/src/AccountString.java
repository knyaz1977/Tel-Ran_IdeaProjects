public class AccountString implements Accountable<String>{

    private String id;
    private int sum;

    public AccountString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {

        return id;
    }

    public int getSum() {

        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
