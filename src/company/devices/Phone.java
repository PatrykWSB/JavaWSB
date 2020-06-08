package company.devices;

import company.creatures.Human;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class Phone extends Device {
    final public Double screenSize;
    final public Boolean android;

    public ArrayList<Application> listOfApps = new ArrayList<Application>();

    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize, Boolean android) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.android = android;
    }

    public String toString() {
        return super.toString() + " " + screenSize + " " + android;
    }

    @Override
    public void turnOn() {
    }

    @Override///DLA SPOKOJU
    public int compareTo(Car o) {
        return 0;
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

    public void installApp(Human owner, Application app) throws Exception {
        if (owner.cash < app.price) throw new Exception("nie stac Cie");
        this.listOfApps.add(0, app);
        owner.cash -= app.price;
    }

    public void isAppInstalled(Application app) {
        for (int i = 0; i < this.listOfApps.size(); i++) {
            if (this.listOfApps.get(i) == app) {
                System.out.println("już zainstalowałeś tą aplikacje");
                break;
            }
        }
        System.out.println("Nie zainstalowałeś jeszcze tej apki");
    }

    public void isAppInstalled2(Application app) {
        for (Application listOfApp : this.listOfApps) {
            if (listOfApp.name == app.name) {
                System.out.println("już zainstalowałeś tą aplikacje");
                break;
            }
        }
        System.out.println("Nie zainstalowałeś jeszcze tej apki");
    }

    public void allFreeApps() {
        for (Application listOfApp : this.listOfApps) {
            if (listOfApp.price == 0.0) System.out.println(listOfApp);
        }
    }

    public double allAppsValue() {
        Double totalvalue = 0.0;
        for (int i = 0; i < this.listOfApps.size(); i++) {
            totalvalue += this.listOfApps.get(i).price;
        }
        return totalvalue;
    }

    public void appSortAlphabet() {
        Collections.sort(this.listOfApps, Application.nameComparator);
        for (Application listOfApp : this.listOfApps) {
            System.out.println(listOfApp);
        }
    }

    public void appSortPrice() {
        Collections.sort(this.listOfApps, Application.priceComparator);
        for (Application listOfApp : this.listOfApps) {
            System.out.println(listOfApp);
        }
    }

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
