public class Car {

    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override // переопределение
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
//        if (obj instanceof Car) { //  instanceof -> является ли объект
//
//        }
        Car car = (Car) obj;
        return /*model.equals(car.model) &&*/ maxSpeed == car.maxSpeed;
    }

    @Override
    public int hashCode() {
//        if (model == null) {
//            int result = 0;
//        }else {
//            int result = model.hashCode();
//        }
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
