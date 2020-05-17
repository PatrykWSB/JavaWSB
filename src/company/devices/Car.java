package company.devices;

import company.creatures.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getAuto() == null) System.out.println("nie mam żadnego auta daj mi spokój");
        else {
            if (buyer.cash < price) System.out.println("sory nie stać Cie");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.setAuto(this);
                seller.setAuto(null);
                System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
            }
        }
    }
}
