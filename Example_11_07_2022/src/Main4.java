public class Main4 {

    public static void main(String[] args) {
        String a = "Hello, world!";
        String b = "Hello, world!";

        String s = "Hello, Java!";
        s = s.toLowerCase(); // перевод строки в нижний регистр
        s = s.trim(); // удаление пробелов в начале и конце строки

        System.out.println("\"" + s + "\"");
        System.out.println("Он сказал \"Hello, Java\"");

        // StringBuffer потока безопасен
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello, java!");
        sb2.append("!");  // добавить к строке строку
        System.out.println(sb2);
        sb2.delete(5,6); // удаление подстроки символов начиная от start до end
        System.out.println(sb2);
        sb2.deleteCharAt(1); // удаление символа в данной позиции
        sb2.insert(2, "qwerty"); // вставляет строку str в позицию offset
        System.out.println(sb2);
        // sb2.reverse()
        // sb2.substring()

        // StringBuilder аналог класса StringBuffer, но исключая потокобезопасность

    }
}
