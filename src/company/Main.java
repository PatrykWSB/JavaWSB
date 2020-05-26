package company;

import company.creatures.Human;
import company.devices.Diesel;

public class Main {
    public static void main(String[] args) {

        Human me = new Human("homo sapiens sapiens", 3);
        Diesel autoOne = new Diesel("Golf", "VW", 2006, 220.0);
        Diesel autoTwo = new Diesel("A4", "Audi", 2010, 120.0);
        Diesel autoThree = new Diesel("Polo", "VW", 2005, 320.0);
        Diesel autoFour = new Diesel("Laguna", "Renault", 2006, 220.0);
        Diesel autoFive = new Diesel("Golf", "VW", 2012, 220.0);
        Diesel autoSix = new Diesel("A3", "Audi", 2013, 220.0);
        Diesel autoSeven = new Diesel("Fabia", "Skoda", 2008, 220.0);
        Diesel autoEight = new Diesel("Vectra", "Opel", 2003, 220.0);
        Diesel autoNine = new Diesel("Corsa", "Opel", 1998, 220.0);

        me.setSalary(999999.0);
        me.setAuto(autoOne, 0);
        me.setAuto(autoTwo, 2);
        me.setAuto(autoThree, 1);
        me.sortGarage();
        me.firstName = "Patryk";
        me.cash = 100.0;

        Human buyer = new Human("homo sapiens sapiens", 3);
        buyer.setSalary(999999.0);
        buyer.firstName = "Benek";
        buyer.cash = 10000.0;
        buyer.setAuto(autoEight, 0);
        buyer.setAuto(autoFive, 2);

        System.out.println("---------------------");
        System.out.println(me.getAuto(0));
        System.out.println(me.getAuto(1));
        System.out.println(me.getAuto(2));
        System.out.println("---------------------");
        System.out.println(buyer.getAuto(0));
        System.out.println(buyer.getAuto(1));
        System.out.println(buyer.getAuto(2));
        System.out.println("---------------------");
        try {
            autoTwo.sell(me, buyer, 234.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(buyer.cash);
        System.out.println(me.cash);
        System.out.println(me.getAuto(0));
        System.out.println(me.getAuto(1));
        System.out.println(me.getAuto(2));
        System.out.println("---------------------");
        System.out.println(buyer.getAuto(0));
        System.out.println(buyer.getAuto(1));
        System.out.println(buyer.getAuto(2));

    }
}