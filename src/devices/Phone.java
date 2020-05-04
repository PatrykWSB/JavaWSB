package devices;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public Boolean android;

    public Phone(String producer, String model, Double screenSize, Boolean android) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.android = android;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + android;
    }
}
