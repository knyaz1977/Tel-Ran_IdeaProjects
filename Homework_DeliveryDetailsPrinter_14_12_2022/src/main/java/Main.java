public class Main {
    // First level: Пусть необходимо создать объект DeliveryDetailsPrinter,
    // который должен печатать сведения о посылках, которыми занимается
    // приложение доставки. Эти сведения должны быть упорядочены по адресу
    // назначения. Разработайте соответствующий (-ие) класс (-ы)
    // (подсказка: объект, осуществляющий печать сведений, должен
    // делегировать обязанность сортировки посылок по адресам доставки
    // другому объекту)
    public static void main(String[] args) {
        DeliveryDetailsRepository detailsRepository = new DtbDeliveryDetailsRepository();
        DeliveryDetailsProxy detailsProxy = new PrintDeliveryDetailsProxy();
        DeliveryDetailsPrinter deliveryDetailsPrinter = new DeliveryDetailsPrinter(detailsProxy, detailsRepository);
        DeliveryDetails deliveryDetails = new DeliveryDetails();
        deliveryDetails.setAddress("Moscow");
        deliveryDetails.setAddress("Berlin");
        deliveryDetails.setAddress("Paris");
        deliveryDetailsPrinter.infPrint(deliveryDetails);

    }
}
