import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(
                Arrays.asList(
                        new Order("toy", "petya", "Moscow", "moskovsaki", "22"),
                        new Order("car", "slava", "Samara", "moskovsaki", "22"),
                        new Order("car", "iii", "Samara", "moskovsaki", "22"),
                        new Order("car", "vasja", "Samara", "moskovsaki", "22"),
                        new Order("table", "igor", "Novgorod", "moskovsaki", "22")
                )
        );
        Set<String> townSet = new HashSet<>();
        for (Order order : orders) {
            String town = order.town;
            townSet.add(town);
        }

        System.out.println(townSet.contains("Samara"));
        System.out.println(townSet.contains("Volgograd"));

        for (String town : townSet) {
            System.out.println(town);
        }

        Integer[] arrayAges = {41, 25, 36, 31, 25};
        Set<Integer> agesSet = new HashSet<>(Arrays.asList(arrayAges));

        System.out.println(agesSet.contains(42));
        System.out.println(agesSet.contains(25));
        agesSet.add(42);
        System.out.println(agesSet.contains(42));
        System.out.println(agesSet.contains(25));


        String[] wordArray = {"Этот", "отель", "был", "ужасным"};

        Set<String> goodWords = new HashSet<>(Arrays.asList(
                "отлично", "класс"
        ));

        Set<String> badWords = new HashSet<>(Arrays.asList(
                "ужасно", "ужасным"
        ));

        int goodRate = 0;
        for (String word : wordArray) {
            if (goodWords.contains(word)) {
                goodRate++;
            } else if (badWords.contains(word)) {
                goodRate--;
            }
        }

        System.out.println(goodRate);
    }

    public static class User {
        String name;
        String email;

        public User(String name, String email) {
            this.name = name;
        }
    }

    public static class Order {
        String orderName;
        String user;
        String town;
        String street;
        String house;

        public Order(String orderName, String user, String town, String street, String house) {
            this.orderName = orderName;
            this.user = user;
            this.town = town;
            this.street = street;
            this.house = house;
        }
    }
}

// public static void main(String[] args) {
//        List<Order> orders = new ArrayList<>(
//                Arrays.asList(
//                    new Order("toy", new User("petya", "test@test.com"), "Moscow", "moskovsaki", "22"),
//                    new Order("car", new User("slava", "test1@gmail.com"), "Samara", "moskovsaki", "22"),
//                    new Order("car", new User("petya", "test@test.com"), "Samara", "moskovsaki", "22"),
//                    new Order("car", new User("petya", "test@test.com"), "Samara", "moskovsaki", "22"),
//                    new Order("table", new User("petya", "test@test.com"), "Novgorod", "moskovsaki", "22")
//                )
//        );
//        Set<String> emailSet = new HashSet<>();
//        for(Order order: orders) {
//            String email = order.user.email;
//            emailSet.add(email);
//        }
//
//        for(String email: emailSet) {
//            System.out.println(email);
//        }