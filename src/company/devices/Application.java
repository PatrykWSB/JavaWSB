package company.devices;

import java.util.Comparator;

public class Application {
    public static Comparator<Application> nameComparator = new Comparator<Application>() {
        @Override
        public int compare(Application jc1, Application jc2) {
            return jc1.name.compareTo(jc2.name);
        }
    };
    public static Comparator<Application> priceComparator = new Comparator<Application>() {
        @Override
        public int compare(Application jc1, Application jc2) {
            return jc1.price.compareTo(jc2.price);
        }
    };
    public String name;
    public String version;
    public Double price;

    public Application(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + version + " " + price;
    }


}
