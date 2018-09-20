package com.capgemini;

public class RaceCarBuilder implements CarBuilder {

    private Car car;

    public RaceCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void buildCarBody() { // Set body to Aerodynamic
        car.setCarBody("Aerodynamic");
    }

    @Override
    public void buildCarDoors() { //Set doors to 2
        car.setCarDoors("2");
    }

    @Override
    public void buildCarEngine() { //Set engine type to Petrol
        car.setCarEngine("Petrol");
    }

    @Override
    public void buildCarColor() { //Set color to Red
        car.setCarColor("Red");
    }

    public Car getCar(){
        return this.car;
    }
}
