public class Main {

    public static void main(String[] args) {
        // Дан файл действительных чисел и некоторое число С.
        // Используя очередь, напечатать сначала все элементы меньшие числа С,
        // а затем все остальные.
        int[] data = new int[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (100 * Math.random());
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        // Начинает работать алгоритм
        int c = 50;
        Queue queue = new Queue();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < c) {
                System.out.print(data[i] + " ");
            } else {
                queue.add(data[i]);
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.delete() + " ");
        }
    }
}
