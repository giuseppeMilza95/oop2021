package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog", FoodType.MEAT);

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.hashCode();

        me.feed(1.0, FoodType.ALL);
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

        dog.feed(1.0, FoodType.MEAT);

        Human brother = new Human(1231.2);

        dog.sell(me, brother, 1.0);

        fiat.refill();


        /**
         * Following the Tasks from Advanced OOP
         * **/

        //Task2

        System.out.println("**************Task2*************");
        Animal cat = new Animal("cat", FoodType.MEAT);
        cat.feed(10.0,FoodType.MEAT);


        Animal dog1 = new Animal("dog", FoodType.ALL);
        dog1.feed(10.0, FoodType.ALL);



        //Task3
        System.out.println("**************Task3*************");
        System.out.println("Country GDP in PLN"  + Country.POLAND.getGdpInPln());


        //Task4
        System.out.println("**************Task4*************");

        Map<Country, Double> area = new HashMap<>();
        area.put(Country.ITALY, 200454150.554);
        area.put(Country.POLAND, 84510444.554);
        area.put(Country.SPAIN, 4152454150.554);
        area.put(Country.GERMANY, 70044514150.554);
        area.put(Country.ENGLAND, 662302150.554);

        double minimum = Collections.min(area.values());
        double maximum = Collections.max(area.values());

        for (Map.Entry<Country, Double> item : area.entrySet()){
            if (item.getValue().equals(minimum)){
                System.out.println("The minimum value is: " + item.getValue() + " and the country code is: " + item.getKey().getCode() + " and the language is: " +item.getKey().getLanguage());
            } if (item.getValue().equals(maximum)){
                System.out.println("The maximum value is: " + item.getValue() + " and the country code is: " + item.getKey().getCode() + " and the language is: " +item.getKey().getLanguage());
            }
        }

        //Task 5
        System.out.println("**************Task5*************");

        Map<String, Country> capital = new HashMap<>();
        capital.put("Rome", Country.ITALY);
        capital.put("Berlin", Country.GERMANY);
        capital.put("Warsaw", Country.POLAND);
        capital.put("London", Country.ENGLAND);
        capital.put("Madrid", Country.ITALY);

        //Converting into a TreeMap to have the result sorted
        Map<String, Country> capitalSorted = new TreeMap<>(capital);

        for (Map.Entry<String, Country> cap : capitalSorted.entrySet()){
            System.out.println("The capital sorted are: " + cap.getKey());
        }

        //Task6
        System.out.println("**************Task6*************");

        Phone siemens = new Phone("siemens","6630",8.0, OperatingSystem.Android);
        Phone siemens2 = new Phone("siemens","515",8.0, OperatingSystem.Android);
        Phone iphone = new Phone("apple","X",8.0,OperatingSystem.iOS);

        Car fordFocus = new Car("ford","focus");
        Car bmw = new Car("bmw","m3");
        Car fordEscort = new Car("ford","Escort");

        List<Device> listOfCar = new ArrayList<>();
        listOfCar.add(fordEscort);
        listOfCar.add(fordFocus);
        listOfCar.add(bmw);

        List<Device> devices = new ArrayList<>();
        devices.add(siemens2);
        devices.add(siemens);
        devices.add(iphone);



        Map<String, List> producer = new HashMap<>();
        producer.put("ford", listOfCar);
        producer.put("siemens", devices);
        //First way:
        System.out.println("**************First Way*************");
        System.out.println(producer.get("ford"));
        System.out.println(producer.get("siemens"));

        //Second way:
        System.out.println("**************Second Way*************");
        for (Map.Entry<String,List> findProducer : producer.entrySet()){
            if (findProducer.getKey().equals("ford")){
                System.out.println(findProducer.getValue().get(0) + " model: " +findProducer.getValue().get(1));
            } else if (findProducer.getKey().equals("siemens")){
                System.out.println(findProducer.getValue().get(0)  + ", "+findProducer.getValue().get(1));
            }
        }


        //Task7
        System.out.println("**************Task7*************");
        Car ferrari = new Car("Ferrari","458");
        ferrari.startACar();
        bmw.stopACar();



    }
}
