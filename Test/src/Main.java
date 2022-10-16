//First level: Напишите программу, проверяющую своевременность закрытия скобок типа (, ), {, }, [, ]
//        в строке символов (если строка состоит из одних скобок этих типов). Так строка (([]{})) является правильной,
//        а строки (({}[)) и (([{]})) - неверны: в первой из них не хватает одной скобки,
//        а во второй нарушена логика (закрывающая скобка должна быть таго же типа, что и последняя открывающаяся).

public class Main {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        String str = ")([{]}))";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st1.push(c);
            } else {
                if (st1.isEmpty() && c > 0) {
                    System.out.println("Wrong bracket string");
                    return;
                }

                int a = st1.pop();
                if ((a == '(' && c != ')') || (a == '[' && c != ']') || (a == '{' && c != '}')) {
                    System.out.println("Wrong bracket string");
                    return;
                }
            }
        }
        if (st1.isEmpty()) {
            System.out.println("Corect bracket string");
        } else {
            System.out.println("Wrong bracket string");
        }
    }
}
//P.S
//        К сожалению, на второе задание времени не хватило.
//        Я понял правила задачи, но мне не хватает знаний для ее решения.
//        Алгоритм понятен, но знание Java немного разочаровывает.
