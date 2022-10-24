import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // First level: 1. Создать статический метод который принимает
        // на вход три параметра: login, password и confirmPassword.
        // Login должен содержать только латинские буквы, цифры и знак подчеркивания.
        // Длина login должна быть меньше 20 символов. Если login не соответствует
        // этим требованиям, необходимо выбросить WrongLoginException.
        // Password должен содержать только латинские буквы, цифры и знак подчеркивания.
        // Длина password должна быть меньше 20 символов.
        // Также password и confirmPassword должны быть равны.
        // Если password не соответствует этим требованиям,
        // необходимо выбросить WrongPasswordException.
        // WrongPasswordException и WrongLoginException - пользовательские классы
        // исключения с двумя конструкторами – один по умолчанию, второй принимает
        // сообщение исключения и передает его в конструктор класса Exception.
        // Обработка исключений проводится внутри метода.
        // Используем multi-catch block.
        // Метод возвращает true, если значения верны или false в другом случае.
//        try {
        WrongLoginException login = new WrongLoginException("qwerty_123456");
        WrongPasswordException password = new WrongPasswordException("freedom", "freedom");
        new WrongLoginException(checkingInputData(login.getLogin()));
        if (password.getPassword() == password.getConfirmPassword()) {
            System.out.println("Password & СonfirmPassword are correct");
            new WrongPasswordException(checkingInputData(password.getPassword()));
        } else {
            System.out.println("WrongConfirmPasswordException");
        }
//        } catch (WrongLoginException e) {
//            System.out.println(e.getLogin());
//        }
    }

    public static boolean checkingInputData(String lp) {

        boolean result = true;
        char[] charsLogin = lp.toCharArray();
        for (char e : charsLogin) {
            if ((Character.isDigit(e) || Character.isAlphabetic(e) || e == '_') && charsLogin.length < 20) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}

class MyException extends java.lang.Exception {
    public MyException(String message) {
        super(message);
    }
}
