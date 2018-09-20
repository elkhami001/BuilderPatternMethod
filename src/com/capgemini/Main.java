package com.capgemini;

public class Main {

    public static void main(String[] args) {

        CarBuilder raceStyleCar = new RaceCarBuilder();

        // The Director can be seen as
        // a car engineer who oversees
        // the construction of the car
	    CarDirector carDirector = new CarDirector(raceStyleCar);

	    carDirector.makeCar();

	    Car firstCar = carDirector.getCar();

        System.out.println(
                "Car built"
                        +"Car body type: "
                        + firstCar.getCarBody()
                        +"Car amount of doors: "
                        + firstCar.getCarDoors()
                        +"Car engine type: "
                        + firstCar.getCarEngine()
                        +"Car color: "
                        + firstCar.getCarColor()
        );
    }
}
