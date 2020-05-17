import java.io.File;

public class Animal implements Saleable {
    public String name;
    final public String species;
    private Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight <= 0) System.out.println("sorry your pet is dead");
        else {
            weight += 1;
            System.out.println("omomom");
        }
    }

    void takeForAWalk() {
        if (weight <= 0) System.out.println("sorry your pet is dead");
        else {
            weight -= 1;
            System.out.println("RUUUUUN");
        }
    }


    public String toString() {
        return name + " " + species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) throw new Exception("nunu nie wolno");

        if (seller.pet == null) System.out.println("nie mam żadnego zwierzaka daj mi spokój");
        else {
            if (buyer.cash < price) System.out.println("sory nie stać Cie");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.pet = this;
                seller.pet = null;
                System.out.println("Pan/i " + buyer.firstName + " kupił od Pana/i " + seller.firstName + " " + buyer.pet.name + " za kwotę " + price);
            }
        }
    }
}

