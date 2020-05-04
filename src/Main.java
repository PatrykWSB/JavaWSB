
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Pieseł";
        System.out.println(dog.name);

        dog.feed();
        dog.takeForAWalk();
    }

}
