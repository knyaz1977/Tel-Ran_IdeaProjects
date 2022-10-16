public class StackString {
    // В этом классе определяется СТРОКОВЫХ значений стек,
// В этом классе определяется целочисленный стек,
// где можно хранить до length строковых значений


    String[] array;
    int top;

    // инициализировать массив и вершину стека
    public StackString(int length) {
        array = new String[length];
        top = -1;
    }

    // добавить элемент в стек
    public void push(String item) {
        if (top == array.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            array[top] = item;
        }
    }

    // извлечь элемент из стека
    public String pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return "";
        } else {
            String value = array[top]; // value - промежуточное число!
            top--;
            return value; // value - промежуточное число!
        }
    }

}
