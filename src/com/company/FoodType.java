package com.company;

public enum FoodType {
    meet(0.7), crops(0.3), all(0.5);

    public double  foodToBodyRatio;
    public Double getAction()
    {
        return this. foodToBodyRatio;
    }

    // enum constructor - cannot be public or protected
    FoodType(Double  foodToBodyRatio)
    {
        this. foodToBodyRatio =  foodToBodyRatio;
    }
}