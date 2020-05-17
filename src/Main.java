import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pieseł";
        /*
        dog.feed();
        dog.takeForAWalk();
        */
        Car fourWheel = new Car("VW", "Golf", 2006);
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

        Car fiveWheel = new Car("VW", "Golf", 2006);
        fiveWheel.value = 200.0;
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
