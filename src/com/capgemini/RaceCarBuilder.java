package com.capgemini;

public class RaceCarBuilder implements CarBuilder {

    private Car car;

    public RaceCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void buildCarBody() {
        car.setCarBody("Aerodynamic");
    }

    @Override
    public void buildCarDoors() {
        car.setCarDoors("2");
    }

    @Override
    public void buildCarEngine() {
        car.setCarEngine("Petrol");
    }

    @Override
    public void buildCarColor() {
        car.setCarColor("Red");
    }

    public Car getCar(){
        return this.car;
    }
}
