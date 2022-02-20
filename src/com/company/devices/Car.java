package com.company.devices;

public class Car extends Device implements Refillable, Comparable<Car> {

    public Double engineSize;
    public String fuelType;
    public Engine engine;
    public boolean isRunning;

    public Car(String producer, String model) {
        super(producer, model);
        this.engine =  new Engine();


    }

    public void startACar(){
        engine.turnOn();
    }

    public void stopACar(){
        System.out.println("The car is turned off");
        isRunning = false;
    }



    @Override
    public void turnOn() {
        System.out.println("turning the key");
        System.out.println("engine starts");
        System.out.println("you can drive now");

    }

    @Override
    public void refill() {
        System.out.println("go to gas awefaw");
        System.out.println("fill the tank with gas");
        System.out.println("PAY!");
    }


    @Override
    public void refillToFull() {

    }

    @Override
    public int compareTo(Car car) {
        return (int) (this.engineSize - car.engineSize);

    }

    public class Engine{
        private int horsePower;
        private double volume;
        private double mileage;



        public void turnOn() {
            System.out.println("It is turned on, you are lucky !");
            isRunning = true;
        }


    }



}
