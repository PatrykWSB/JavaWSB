
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pieseł";
        System.out.println(dog.name);

        dog.feed();
        dog.takeForAWalk();

        Car fourWheel = new Car("VW", "Golf");
        fourWheel.value = 200.0;

        Human man = new Human();
        man.firstName = "Pan";
        man.lastName = "Panicz";
        man.pet = dog;

        man.setAuto(fourWheel);


        /*
        man.getSalary();
        man.setSalary(300.0);
        man.getSalary();
        man.getSalary();
        */
    }

}
