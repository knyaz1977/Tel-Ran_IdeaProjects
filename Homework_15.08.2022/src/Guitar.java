public class Guitar implements Toolable {

    int quantity_Of_Strings;

    public Guitar(int quantity_Of_Strings) {
        this.quantity_Of_Strings = quantity_Of_Strings;
    }

    public int getQuantity_Of_Strings() {
        return quantity_Of_Strings;
    }

    public void setQuantity_Of_Strings(int quantity_Of_Strings) {
        this.quantity_Of_Strings = quantity_Of_Strings;
    }

    @Override
    public void play() {
        System.out.println("A guitar with " + quantity_Of_Strings + " strings is playing");
    }
}
