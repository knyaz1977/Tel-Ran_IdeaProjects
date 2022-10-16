public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        String[] str = {"5","-2","4","C","D","9","+","+"};
        for (int i = 0; i < str.length; i++) {
            if (str[i] == "C") {
                st1.pop();
            } else if (str[i] == "D") {
                st1.push(2 * st1.top());
            } else if (str[i] == "+") {
                int a = st1.pop();
                int b = st1.top();
                st1.push(a);
                st1.push(a + b);
            } else {
                st1.push(Integer.parseInt(str[i]));
            }

        }
        int sum = 0;
        while (!st1.isEmpty()) {
            sum += st1.pop();
        }
        System.out.println(sum);
    }
}

// Example 1:
//
//
//Input: ops = ["5","2","C","D","+"]
//Output: 30
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"2" - Add 2 to the record, record is now [5, 2].
//"C" - Invalidate and remove the previous score, record is now [5].
//"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//The total sum is 5 + 10 + 15 = 30.
//
//
//Example 2:
//
//
//Input: ops = ["5","-2","4","C","D","9","+","+"]
//Output: 27
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"-2" - Add -2 to the record, record is now [5, -2].
//"4" - Add 4 to the record, record is now [5, -2, 4].
//"C" - Invalidate and remove the previous score, record is now [5, -2].
//"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
//
//
//Example 3:
//
//
//Input: ops = ["1","C"]
//Output: 0
//Explanation:
//"1" - Add 1 to the record, record is now [1].
//"C" - Invalidate and remove the previous score, record is now [].
//Since the record is empty, the total sum is 0.