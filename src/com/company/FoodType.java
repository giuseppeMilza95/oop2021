package com.company;

public enum FoodType {
    MEAT(0.7), CROPS(0.3), ALL(0.5);

    public double  foodToBodyRatio;


    // enum constructor - cannot be public or protected
    FoodType(Double  foodToBodyRatio)
    {
        this. foodToBodyRatio =  foodToBodyRatio;
    }
}