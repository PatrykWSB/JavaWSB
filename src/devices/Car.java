package devices;

public class Car extends Device {

    public Double value;

    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public String toString() {
        return super.toString() + " " + this.value;
    }

    @Override
    public void turnOn() {

    }
}
