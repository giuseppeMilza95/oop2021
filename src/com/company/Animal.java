package com.company;

public class Animal {

    /*public enum FoodType {
        meet(0.7), crops(0.3), all(0.5);

        private double  foodToBodyRatio;
        public Double getAction()
        {
            return this. foodToBodyRatio;
        }

        // enum constructor - cannot be public or protected
        private FoodType(Double  foodToBodyRatio)
        {
            this. foodToBodyRatio =  foodToBodyRatio;
        }
    }*/


    final static Double DEFAULT_DOG_WEIGHT = 6.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 1.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;
    final static Double DEFAULT_WEIGHT = 0.5;
    public final String species;
    private Double weight;
    public  final FoodType foodType;

    public Animal(String species, FoodType foodType) {
        this.species = species;
        this.foodType = foodType;

        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
        }

    }

    void printWeight() {
        System.out.println(weight);
    }

    void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT,FoodType.all);
    }

    void feed(Double foodWeight, FoodType foodType) {
        if (this.foodType == foodType){
        switch (this.foodType){
            //TASK2 -1
//            case all -> this.weight += (foodWeight/2);
//            case crops -> this.weight += (0.3 * foodWeight);
//            case meet -> this.weight += (0.7 * foodWeight);
            //TASK2 - 2
            case all -> this.weight += foodWeight *FoodType.all.foodToBodyRatio;
            case crops -> this.weight += foodWeight *FoodType.crops.foodToBodyRatio;
            case meet -> this.weight += foodWeight *FoodType.meet.foodToBodyRatio;

        }
        } else{
            System.out.println("No body mass gained");
        }

        //OLD CODE:
//        this.weight += foodWeight;
//        System.out.println("thx for food, bro");
//        System.out.println("my weight is now " + this.weight);
    }
    


    public void setWeight(Double weight) {
        this.weight = weight;
    }

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println(this.name);
        if (seller.pet == this) {
            seller.pet = null;
            buyer.pet = this;
        }
    }

}
