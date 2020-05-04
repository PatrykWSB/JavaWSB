
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pieseł";
        System.out.println(dog.name);

        dog.feed();
        dog.takeForAWalk();

        Car fourWheel = new Car("VW", "Golf");

        Human man = new Human();
        man.firstName = "Pan";
        man.lastName = "Panicz";
        man.pet = dog;
        man.auto = fourWheel;
        System.out.println(man.auto.model);
    }

}
