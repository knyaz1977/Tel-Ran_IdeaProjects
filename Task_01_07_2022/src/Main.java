public class Main {

    public static void main(String[] args) {
        String[] words = {"Яблоко", "Апельсин", "Манго", "Банан"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        String temp;
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            temp = words[n - i - 1];
            words[n - i - 1] = words[i];
            words[i] = temp;
            System.out.println();
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        int maxIndex = (int) (Math.random() * 6);
        int[] mas1 = new int[maxIndex];
        int[] mas2 = new int[maxIndex];

        for (int i = 0; i < maxIndex; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        float number1 = 0;
        float number2 = 0;
        for (int i = 0; i < maxIndex; i++) {
            number1 += mas1[i];
            number2 += mas2[i];
        }
        number1 /= mas1.length;
        ;
        number2 /= mas2.length;

        if (number1 > number2) {
            System.out.println("(" + number1 + ") > (" + number2 + ")");
        } else if (number1 < number2) {
            System.out.println("(" + number1 + ") < (" + number2 + ")");
        } else {
            System.out.println("(" + number1 + ") = (" + number2 + ")");
        }

        // Найти максимальное значение в массиве через рекурсию
        int maxIndex1 = 5 + (int) (Math.random() * 10);// рандомная длина массива
        maxIndex1 = 5;
        int[] mas = new int[maxIndex1];// создаем массив

        // заполняем массив
        for (int i = 0; i < maxIndex1; i++) {
            mas[i] = (int) (Math.random() * 6);
        }
        // вывод массива
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        // вывод метода
        System.out.print("max ="  +arrayMax(mas, 0,mas.length));
    }
    private static int arrayMax(int[] mas, int i, int maxLength) {
        if (maxLength == 0) {
            return mas[0];
        }
        return Math.max(mas[i], arrayMax(mas,i+1,maxLength-1));
    }
}