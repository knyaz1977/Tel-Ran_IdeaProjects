public class Main {
    public static void main(String[] args) {

        // First level: Напишите программу, проверяющую своевременность закрытия скобок типа (, ), {, }, [, ]
        // в строке символов (если строка состоит из одних скобок этих типов). Так строка (([]{})) является правильной,
        // а строки (({}[)) и (([{]})) - неверны: в первой из них не хватает одной скобки, а во второй нарушена логика (){[]}
        // (закрывающая скобка должна быть того же типа, что и последняя открывающаяся).

        Stack st1 = new Stack();
        String str = "(([{]}))";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                st1.push(c);
            } else if (c == '[') {
                st1.push(c);
            } else if (c == '{') {
                st1.push(c);
            } else {
                if (st1.isEmpty()) {
                    System.out.println("Wrong bracket string");
                    return;
                }
                if (c == ')') {
                    st1.pop();
                } else if (c == ']') {
                    st1.pop();
                } else if (c == '}') {
                    st1.pop();
                } else {
                    if (st1.isEmpty()) {
                        System.out.println("Wrong bracket string");
                        return;
                    }
                }
            }
        }
        if (st1.isEmpty()) {
            System.out.println("Correct bracket string");
            return;
        } else {
            System.out.println("Wrong bracket string");
        }
    }
}