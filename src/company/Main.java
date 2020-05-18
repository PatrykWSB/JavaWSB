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
        fourWheel.value = 300.0;

        Phone myPhone = new Phone("Xiaomi", "Redmi Note 4", 2016, 5.5, true);

        Human man = new Human("Homo sapiens sapiens", 3);
        man.firstName = "Pan";
        man.lastName = "Panicz";
        man.pet = dog;
        man.tel = myPhone;
        man.cash = 100000.0;

        Human buyer = new Human("Homo sapiens sapiens", 4);
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
        man.setSalary(30000.0);
        man.setAuto(fourWheel, 0);

        Diesel fiveWheel = new Diesel("VW", "Golf", 2006);
        fiveWheel.value = 700.0;

        man.setAuto(fiveWheel, 1);
        Double garageValue = man.getGarageValue(2);
        System.out.println(garageValue);

        myPhone.installApp("headbook", "1.2.30");
        myPhone.installApp("headbook", "1.23.41", "appStore.com/headbook");
        //System.out.println(fiveWheel);
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

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println(" new number: " + i);
        */

    }

}
