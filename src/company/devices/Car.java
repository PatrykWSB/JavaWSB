package company.devices;

import company.creatures.Human;

import java.util.ArrayList;

public abstract class Car extends Device implements Comparable {

    public ArrayList<Transaction> listOfTransactions = new ArrayList<Transaction>();

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
        if (this.listOfTransactions.get(this.listOfTransactions.size() - 1).buyer != seller)
            throw new Exception("sory nie jesteś właścicielem tego auta");
        buyer.cash -= price;
        seller.cash += price;
        buyer.buyCar(this);
        seller.sellCar(this);
        this.listOfTransactions.add(new Transaction(seller, buyer, price, "26.05.2020"));///NIE CHCIALO MI SIE WSTAWIAC DATY
        System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
    }

    @Override
    public int compareTo(Car o) {
        int result = this.yearOfProduction.compareTo(o.yearOfProduction);
        return -result;
    }

    public boolean wasOwner(Human owner) {
        if (owner == this.listOfTransactions.get(0).buyer) return true;
        for (Transaction listOfTransaction : this.listOfTransactions) {
            if (owner == listOfTransaction.seller) return true;
        }
        return false;
    }

    public boolean wasSoldAB(Human seller, Human buyer) {
        for (Transaction listOfTransaction : this.listOfTransactions) {
            if (seller == listOfTransaction.seller && buyer == listOfTransaction.buyer)
                return true;
        }
        return false;
    }

    public int numberOfTransactions() {
        return this.listOfTransactions.size();
    }

    public abstract void refuel();
}