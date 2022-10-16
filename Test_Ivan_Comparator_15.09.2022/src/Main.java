import java.util.*;

public class Main {
    public static void main(String[] args) {


        House house1 = new House(101, 10003, "Berlin", true);
        House house2 = new House(103, 10002, "Berlin1", true);
        House house3 = new House(102, 10001, "Berli", true);

        ArrayList<House> houses = new ArrayList<>(List.of(house1,house2,house3)); // Создал Arraylist из House

        PriceComparator priceComparator = new PriceComparator();
        AreaComparator areaComparator = new AreaComparator();
        CityComparator cityComparator = new CityComparator();

        Collections.sort(houses,priceComparator); // Отсортировали по цене т.е. по priceComparator

        for (House house : houses) {
            System.out.println(house);
        }

        priceComparator.compare(house1,house2); // Сравнили два дома по цене (priceComparator)

        int a =  house1.compareTo(house2); // сравнили что-то, в данном случае house1 с house2
        System.out.println(a);

        priceComparator.thenComparing(areaComparator).thenComparing(cityComparator).compare(house1,house2);
        // Если у house1 и house2 одинаковый Price то используя метод thenComparing(areaComparator)
        // сравниваем уже по Area и тд

    }
}