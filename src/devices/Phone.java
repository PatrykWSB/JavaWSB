package devices;

public class Phone extends Device {
    final public Double screenSize;
    final public Boolean android;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Boolean android) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.android = android;
    }

    public String toString() {
        return super.toString() + " " + screenSize + " " + android;
    }

    @Override
    public void turnOn() {

    }
}
