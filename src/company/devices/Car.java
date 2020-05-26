package company.devices;

import company.creatures.Human;

public abstract class Car extends Device implements Comparable {


    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    public String toString() {
        return super.toString() + " " + this.value;
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.hasCar(this)) throw new Exception("sory nie mam auta");
        if (buyer.isFreeSpot()) throw new Exception("sory nie masz miejsca w garażu");
        if (buyer.cash < price) throw new Exception("sory nie stać Cie");
        buyer.cash -= price;
        seller.cash += price;
        buyer.buyCar(this);
        seller.sellCar(this);
        System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
    }


    @Override
    public int compareTo(Car o) {
        int result = this.yearOfProduction.compareTo(o.yearOfProduction);
        return -result;
    }

    public abstract void refuel();
}