package company.devices;

public class Electric extends Car {
    public Electric(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
