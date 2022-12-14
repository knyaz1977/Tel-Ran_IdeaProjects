public class DtbDeliveryDetailsRepository implements DeliveryDetailsRepository {
    @Override
    public void sortedDelivery(DeliveryDetails deliveryDetails) {
        System.out.println("Storing Details: " + deliveryDetails.getAddress());
    }

}
