package com.capgemini;

public class Car implements CarPlan {
    private String carBody;
    private String carDoors;
    private String carEngine;
    private String carColor;

    @Override
    public void setCarBody(String body) {
        carBody = body;
    }

    @Override
    public void setCarDoors(String doors) {
        carDoors = doors;
    }

    @Override
    public void setCarEngine(String engine) {
        carEngine = engine;
    }

    @Override
    public void setCarColor(String color) {
        carColor = color;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getCarDoors() {
        return carDoors;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public String getCarColor() {
        return carColor;
    }
}
