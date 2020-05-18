package company.devices;

import company.creatures.Human;

import java.util.Scanner;

public abstract class Car extends Device {

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
        Scanner sc = new Scanner(System.in);
        Integer buyerIndex = sc.nextInt();
        Integer sellerIndex = sc.nextInt();


        if (seller.getAuto(sellerIndex) == null) System.out.println("nie mam żadnego auta daj mi spokój");
        else {
            if (buyer.cash < price) System.out.println("sory nie stać Cie");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.setAuto(this, buyerIndex);
                seller.setAuto(null, sellerIndex);
                System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
            }
        }
    }

    public abstract void refuel();
}
