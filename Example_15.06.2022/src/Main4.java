public class Main4 {

    public static void main(String[] args) {
        // Необходимо вывести на консоль такую последовательность чисел:
        // 1 2 4 8 16 32 64 128 256 512
        // 1024 байта равняются килобайту
        // 1000 байт равняются килобайту

        for (int i = 0; i < 10; i++) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
        System.out.println();
        int i = 1;
        while (i <= 512) {
            System.out.print(i  + " ");
            i = i * 2;
        }
    }
}
