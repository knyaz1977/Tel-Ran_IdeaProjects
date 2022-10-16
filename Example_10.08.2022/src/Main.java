public class Main {

    public static void main(String[] args) {
        // Do your homework of 2 choices. The first task is easy, the second is more difficult. We wish you good luck!
        //First level: 1. Создайте классы «Собака» и «Кот» с наследованием от класса «Животное».
        //Все животные могут бежать и плыть. В качестве параметра каждому методу передаётся длина препятствия. Результатом выполнения действия будет печать в консоль.
        //Например, dogBobik.run(150); -> 'Бобик пробежал 150 м'.
        //У каждого животного есть ограничения на действия:
        //бег: кот - 200 м, собака - 500 м;
        //плавание: кот не умеет плавать, собака - 10 м.
        Dog bobik = new Dog("Bobik");
        bobik.run(10);
        bobik.run(1000);
        bobik.swim(5);
        bobik.swim(40);

        Cat barsik = new Cat("Barsik");
        barsik.run(100);
        barsik.run(300);
        barsik.swim(29);


    }
}
