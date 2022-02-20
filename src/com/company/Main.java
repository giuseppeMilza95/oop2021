package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

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


      //task4


        Map<Country, Double> area = new HashMap<>();
        area.put(Country.ITALY, 200454150.554);
        area.put(Country.POLAND, 84510444.554);
        area.put(Country.SPAIN, 4152454150.554);
        area.put(Country.GERMANY, 70044514150.554);
        area.put(Country.UNITEDKINDOM, 662302150.554);

        double minimum = Collections.min(area.values());
        double maximum = Collections.max(area.values());


        for (Map.Entry<Country, Double> item : area.entrySet()){
            if (item.getValue().equals(minimum)){
                System.out.println("The minimum value is: " + item.getValue() + "and the country code is: " + item.getKey().getCode());
            } else if (item.getValue().equals(maximum)){
                System.out.println("The maximum value is: " + item.getValue() + "and the country code is: " + item.getKey().getCode());
            }
        }

        //Task 5

        Map<String, Country> capital = new TreeMap<>();
        capital.put("Rome", Country.ITALY);
        capital.put("Berlin", Country.GERMANY);
        capital.put("Warszawa", Country.POLAND);
        capital.put("London", Country.UNITEDKINDOM);
        capital.put("Madrid", Country.ITALY);




        for (Map.Entry<String, Country> cap : capital.entrySet()){
            System.out.println("The capital sorted are: " + cap.getKey());
        }

        //Task6

        //Create a HashMap with String producer as key and list of devices as value.
        //Add a few objects into the map.
        //Find all devices produced by Ford and Siemens.

        Device siemens = new Phone("siemens","6630",8.0, OperatingSystem.Android);
        Device fordFocus = new Car("ford","focus");
        Device bmw = new Car("bmw","m3");
        Device fordXmax = new Car("ford","XMAX");
        Map<String, Device> producer = new HashMap<>();
        producer.put(fordFocus.producer, fordFocus);
        producer.put(siemens.producer, siemens);
        producer.put(bmw.producer, bmw);
        //Like this:



        System.out.println(producer.get("ford"));

        //Or like this:



        for (Map.Entry<String,Device> findProducer : producer.entrySet()){
            if (findProducer.getKey().toLowerCase().equals("ford")){
                System.out.println("The device produces by ford is: " + findProducer.getValue().producer + " model: " +findProducer.getValue().model);
            } else if (findProducer.getKey().toLowerCase().equals("siemens")){
                System.out.println("The device produces by ford is: " + findProducer.getValue().producer + " model: " +findProducer.getValue().model);
            }
        }










    }
}
