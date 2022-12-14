public class DeliveryDetailsPrinter {

    private  final DeliveryDetailsProxy detailsProxy;

    private final DeliveryDetailsRepository detailsRepository;

    public DeliveryDetailsPrinter(DeliveryDetailsProxy detailsProxy, DeliveryDetailsRepository detailsRepository) {
        this.detailsProxy = detailsProxy;
        this.detailsRepository = detailsRepository;
    }

    public void infPrint(DeliveryDetails deliveryDetails){
        detailsRepository.sortedDelivery(deliveryDetails);
        detailsProxy.printDetails(deliveryDetails);


    }

}
