public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack(10);
        st1.push(10);
        st1.push(100);
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
//        System.out.println();
        for (int i = 0; i < 10; i++) {
            st1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(st1.pop() + " ");
        }
        System.out.println();
        StackString st2 = new StackString(10);
        st2.push("qwerty");
        System.out.println(st2.pop());
    }

}
