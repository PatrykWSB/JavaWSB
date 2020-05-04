package devices;

public class Car {
    final public String model;
    final public String producer;
    final public String yearOfProduction;
    public Double value;

    public Car(String model, String producer, String yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + value;
    }
}
