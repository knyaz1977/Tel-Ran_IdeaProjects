public class Pizza {
    // Создайте класc Pizza, поля size типа String (с возможными значениями "small", "medium", "large"), cheese:int,
    // pepperoni:int,ham:int=0. Добавьте конструктор вида Pizza(String size, int cheese, int pepperoni, int ham),
    // геттеры,сеттеры и toString. Добавьте метод calcPrice(): int - маленькая 10, средняя 12, большая 14 и
    // каждый топпинг по 2.
    String size;

    int cheese;
    int pepperoni;
    int ham;
    int small = 10;
    int medium = 12;
    int large = 14;


    public Pizza() {
    }

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", ham=" + ham +
                '}';
    }

    // Добавьте метод calcPrice(): int - маленькая 10, средняя 12, большая 14 и
// каждый топпинг по 2.
    public int calcPrice() { //String size, int cheese, int pepperoni, int ham
        int sum = 2 * cheese + 2 * pepperoni + 2 * ham;
        if (size == "small") {
            return small + sum;
        } else if (size == "medium") {
            return medium + sum;
        } else if (size == "large") {
            return large + sum;
        } else {
            return -1;
        }
    }
}