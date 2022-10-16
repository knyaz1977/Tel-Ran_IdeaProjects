public class Main {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15); // создать объект myBox1 класса Box
        Box myBox2 = new Box(3, 6, 9); // создать объект myBox2 класса Box
        double volume;

//        Box myBox3 = new Box();

        // Присвоить значения переменным экземпляра myBox1
//        myBox1.setDim(10,20,15);
//        myBox1.width =10;
//        myBox1.height = 20;
//        myBox1.depth = 15;

        // Рассчитать объем параллелепипеда
        volume = myBox1.getVolume();
        System.out.println("Volume: " + volume); // myBox1.getVolume()

//        volume = myBox1.width * myBox1.height * myBox1.depth;
//        System.out.println("Volume = " + (int)volume);

        // Присвоить значения переменным экземпляра myBox2
        myBox2.setDim(3,6,9);
//        myBox2.width =3;
//        myBox2.height = 6;
//        myBox2.depth = 9;

        // Рассчитать объем параллелепипеда
        System.out.println("Volume: " + myBox2.getVolume());
//        myBox2.getVolume();

//        volume = myBox2.width * myBox2.height * myBox2.depth;
//        System.out.println("Volume = " + (int)volume);

//        Box[] boxes = new  Box[2];
//        boxes[0] = myBox1;
//        boxes[1] = myBox2;

        System.out.println();

        Box[] boxes = {myBox1, myBox2}; // сокращенная запись того, что выше
        for (int i = 0; i < boxes.length; i++) {
            System.out.print((int)boxes[i].getVolume() + " ");
        }


    }

}
