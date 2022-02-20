package com.company;

import com.company.devices.Car;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog", FoodType.meet);

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.hashCode();

        me.feed(1.0, FoodType.all);
        System.out.println(me.species);

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                OperatingSystem.Android);

        Phone iPhone6 = new Phone("apple", "6s", 5.0, OperatingSystem.iOS);

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car("fiat", "bravo");
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        System.out.println(fiat.producer);

        dog.feed(1.0, FoodType.meet);

        Human brother = new Human(1231.2);

        dog.sell(me, brother, 1.0);

        fiat.refill();

        //Task2
        Animal cat = new Animal("cat", FoodType.meet);
        cat.feed(10.0,FoodType.meet);
        cat.printWeight();

        Animal dog1 = new Animal("dog", FoodType.all);
        dog1.feed(10.0, FoodType.all);
        dog1.printWeight();


        CountryGDP italy = new CountryGDP();

        System.out.println(italy.GdpToUsd());






    }
}
