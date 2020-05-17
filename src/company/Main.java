package company;

import company.creatures.Human;
import company.creatures.Pet;
import company.devices.Diesel;
import company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog");
        dog.name = "Pieseł";

        dog.feed();
        dog.feed(5.0);
        dog.takeForAWalk();

        Diesel fourWheel = new Diesel("VW", "Golf", 2006);
        fourWheel.value = 200.0;

        Phone myPhone = new Phone("Xiaomi", "Redmi Note 4", 2016, 5.5, true);

        Human man = new Human("Homo sapiens sapiens");
        man.firstName = "Pan";
        man.lastName = "Panicz";
        man.pet = dog;
        man.tel = myPhone;
        man.cash = 100.0;

        Human buyer = new Human("Homo sapiens sapiens");
        buyer.firstName = "Ewelina";
        buyer.lastName = "Sprzedawca";
        buyer.tel = myPhone;
        buyer.cash = 2000.0;

        try {
            man.pet.sell(man, buyer, 500.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            man.pet.sell(man, buyer, 500.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(man.pet);

        man.setAuto(fourWheel);

        Diesel fiveWheel = new Diesel("VW", "Golf", 2006);
        fiveWheel.value = 200.0;

        myPhone.installApp("headbook", "1.2.30");
        myPhone.installApp("headbook", "1.23.41", "appStore.com/headbook");
        /*
        System.out.println(fourWheel.equals(fiveWheel));
        System.out.println(fourWheel);
        System.out.println(fiveWheel);
        System.out.println(dog);
        System.out.println(myPhone);
        System.out.println(man);

        man.getSalary();
        man.setSalary(300.0);
        man.getSalary();
        man.getSalary();
        */
    }

}
