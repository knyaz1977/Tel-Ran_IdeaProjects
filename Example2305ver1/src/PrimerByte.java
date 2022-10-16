import java.sql.SQLOutput;

public class PrimerByte {
    public static void main(String[] args) {
        byte b = 5;
        System.out.println(b);
        byte b1 = (byte) 500;
        System.out.println(b1);


        short sh = 34;
        long lng = 56;

        double pi = 3.14;
        float pi2 = 3.14f;    // преобразование типов
        float pi3 = (float) 3.14; // явное преобразование типов (предпочтительней)
        int a = (int) lng; // преобразование типа lng(8 байт) в другой int(4 байта)

         char ch = 'q';

         boolean f = true;   //либо boolean f = false

    }
}
