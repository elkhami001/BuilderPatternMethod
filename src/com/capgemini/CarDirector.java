package com.capgemini;

public class CarDirector { // The Director can be seen as a car engineer who oversees the construction of the car
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }

    public void makeCar(){
        this.carBuilder.buildCarBody();
        this.carBuilder.buildCarDoors();
        this.carBuilder.buildCarEngine();
        this.carBuilder.buildCarColor();
    }
}
