package company.devices;

import company.creatures.Human;

public class Transaction {
    public Human seller;
    public Human buyer;
    public Double price;
    public String date;

    public Transaction(Human seller, Human buyer, Double price, String date) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.date = date;
    }

    public String toString() {
        return seller + " " + buyer + " " + price + " " + date;
    }
}

