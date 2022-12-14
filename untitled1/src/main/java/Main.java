public class Main {

    public static void main(String[] args) {
        DeliveryDetailsPrinter printer1 = new DeliveryDetailsPrinter(new SorterByAddress());
        printer1.printDetails();

        DeliveryDetailsPrinter printer2 = new DeliveryDetailsPrinter(new SorterByName());
        printer2.printDetails();
    }
}
