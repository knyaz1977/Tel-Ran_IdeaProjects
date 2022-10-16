import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        User user1 = new User("user1", "test@test.com", "aaa1");
        User user2 = new User("user2", "test@test1.com", "ppp");

        List<User> users = Arrays.asList(
                user1, user2
        );

        Order order1 = new Order(user1, "Maxi toy", 224L, 2L);
        Order order2 = new Order(user1, "Lego", 124L, 1L);
        Order order3 = new Order(user2, "Renault Yoe", 220004L, 1L);
        Order order4 = new Order(user1, "Maxi toy", 224L, 1L);

        List<Order> orders = Arrays.asList(
                order1, order2, order3, order4
        );

        for (Order order: orders) {
//           String  = order.get
        }


//        String problematicUser = getUsersWithICorrectEmails(users);
//        System.out.println(problematicUser);
//        System.out.println(isValid(users));
//
//    }
//
//    public static boolean isValid(List<User> users) {
//        String problematicUser = getUsersWithICorrectEmails(users);
//        return problematicUser.isEmpty();
//    }
//
//    public static String getUsersWithICorrectEmails(List<User> users) {
//        StringBuilder builder = new StringBuilder();
//        for (User userFor : users) {
//            String email = userFor.getEmail();
//            String name = userFor.getName();
//            if (!email.contains("@")) {
//                builder.append(name).append(",");
//            }
//        }
//        String result = builder.toString();
//        if (!result.isEmpty()) {
//            return result.substring(0, result.length() - 1);
//        }
//        return result;
    }
}