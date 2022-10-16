public class Main2 {

    public static void main(String[] args) {
//        System.out.println("Hello, Java!");


        //обычно в качестве параметра цикла используются i, j, k
        // i = 0, 1, 2, 3, 4 - параметр цикла принимает последовательно эти значения
        // i = i + 1 заменяют i++
        for (int i = 0; i < 5; i = i + 1) { // если убрать i = i + 1 будет вечный цикл
            System.out.println(i + ": Hello, Java!");
        }
        // i = i + 2 заменяют на i += 2
        for (int i = 0; i < 5; i = i + 2) {
            System.out.println();
            System.out.println(i + ": Hello, Java!");
        }
        System.out.println();
        for (int count = 0; count < 10; count++) {

//            if (count % 2 == 0) {
//                System.out.println(count + " is even");
//            } else {
//                System.out.println(count + " is odd");
//            }
            evenCheck(count);
        }
        // i-- замена i = i - 1, i = i -2 заменя i -= 2
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println();
            System.out.println(i + ": Hello, Java!");
        }
    }

    private  static void evenCheck(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
