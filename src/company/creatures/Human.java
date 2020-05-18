package company.creatures;

import company.devices.Car;
import company.devices.Phone;

import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone tel;
    public Double cash;
    private Car[] garage;

    private Double salary = 200.0;
    private Date checkDate = new Date();
    private Double checkSalary = 200.0;

    public Human(String species, Integer garageSize) {
        super(species);
        this.garage = new Car[garageSize];
    }

    public Double getGarageValue(Integer garageSize) {
        Double value = 0.0;
        for (int i = 0; i < garageSize; i++) {
            value += this.garage[i].value;
        }
        return value;
    }

    public Double getSalary() {
        System.out.println("Last time your salary was " + checkSalary + " actual for date: " + checkDate);
        checkDate = new Date();
        checkSalary = salary;
        return salary;
    }

    public void setSalary(Double sal) {
        if (sal < 0) System.out.println("ERROR: You cannot pay us");
        else {
            System.out.println("New data send to system. Go to Ms. Hania, she will give u annex. Ahh and one more thing ZUS and US know about this so you know don't try to hide it.");
            this.salary = sal;
        }
    }

    public Car getAuto(Integer index) {
        return garage[index];
    }

    public void setAuto(Car newauto, Integer index) {
        if (salary > newauto.value) {
            this.garage[index] = newauto;
            System.out.println("Nice you got yourself a car");
        } else if (salary > newauto.value / 12) {
            this.garage[index] = newauto;
            System.out.println("You need a credit but you can have it");
        } else System.out.println("Dude go to school, get a raise or change job idk");
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + garage[0] + " " + tel;
    }
}
