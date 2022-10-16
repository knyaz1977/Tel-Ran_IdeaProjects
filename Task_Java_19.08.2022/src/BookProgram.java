public class BookProgram {

    public void main(String[] args) {
        Book b1 = new Book("War and Peace","Tolstoy", Type.SCEINCE_FICTION);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);

        switch (b1.bookType){
            case COMEDY:
                System.out.println("Это комедия");
                break;
            case  SCEINCE_FICTION:
                System.out.println("Это научное");

        }
    }

    enum Type
    {
        PHANTASY,
        COMEDY,
        SCEINCE_FICTION
    }

    class Book{
        String name;
        String author;
        Type bookType;

        Book(String name, String author, Type type){
            bookType = type;
            this.name = name;
            this.author = author;
        }
    }
}
// Используя switch case рассмотрите ситуации с разными перечеслениями и напишите соотвествующий вывод:
// case COMEDY - это комедия