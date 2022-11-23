public class Counter {
    int count = 0;

    public Counter() {
        this.count = count;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;

    }

    public int add() {
        count = count + 1;
        System.out.println("addCount: " + count);
        return count;
    }

    public int sub() {
        count = count - 1;
        System.out.println("subCount: " + count);
        return count;
    }

}
