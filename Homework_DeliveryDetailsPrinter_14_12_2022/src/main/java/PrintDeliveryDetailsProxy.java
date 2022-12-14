public class PrintDeliveryDetailsProxy implements DeliveryDetailsProxy{


    @Override
    public void printDetails(DeliveryDetails deliveryDetails) {
        System.out.println("print information about packages: " + deliveryDetails);
    }
}
