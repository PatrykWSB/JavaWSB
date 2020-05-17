package company.devices;

import company.creatures.Human;

import java.net.URL;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.tel == null) System.out.println("nie mam żadnego telefonu daj mi spokój");
        else {
            if (buyer.cash < price) System.out.println("sory nie stać Cie");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.tel = this;
                seller.tel = null;
                System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
            }
        }
    }

    static final String DEFAULT_SERVER_ADRESS = "play.google.com";
    static final String DEFAULT_VERSION = "1.11.02";
    static final String DEFAULT_PROTOCOL = "https";

    public void installApp(String appName) {
        System.out.println("You installed " + appName);
    }

    public void installApp(String appName, String version) {
        System.out.println("You installed " + appName + " in version " + version);
    }

    public void installApp(String appName, String version, String serverAdress) {
        System.out.println("You installed " + appName + " in version " + version + " " + " from " + serverAdress);
    }

    public void installApp(String[] appNames) {
        for (String appName : appNames) {
            installApp(appName);
        }
    }

    public void installApp(URL appURL) {
        System.out.println("You installed " + appURL);
    }

}
