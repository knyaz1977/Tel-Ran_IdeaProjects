public class Main3 {
    public static void main(String[] args) {
//        String s1 = "Hello, Java!";
        String s1 = "Hello," + " Java!"; // s1 находится в Heap
//        String s3 = "Hello," + s2;
        String s = "Hello, Java!"; // s находится в Heap
        String s2 = " Java!"; // s2 находится в Heap
        String s3 = "Hello," + s2; // Hello находится в Heap, s2 находится в Pool

        System.out.println("String s1 equals s2: " + (s1 == s));
        System.out.println("String s1 equals s3: " + (s == s3));

        // ***************************
        System.out.println();
        String ss1 = "Hello, Java!";
        String ss2 = "Hello, Java!";
        String ss3 = (new String("Hello, Java!")).intern();// intern - переносит объекты в Pool
        String ss4 = (new String("Hello, Java!")).intern();
        Integer a = new Integer(4);
        Integer b = new Integer(4);
//        int a = 4;
//        int b = 4;

        System.out.println("String s1 equals s2? " + (ss1 == ss2));
        System.out.println("String s1 equals s2? " + (ss2 == ss3));
        System.out.println("String s1 equals s2? " + (ss3 == ss4));
        System.out.println("Integer a equals Integer b? " + (a == b));

    }
}
