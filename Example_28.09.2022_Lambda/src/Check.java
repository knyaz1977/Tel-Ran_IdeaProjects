public class Check implements Checkable{

    @Override
    public boolean checkNumber(int number) {
        return number % 13 == 0;
    }
}
// Класс посредник, который теперь не нужен