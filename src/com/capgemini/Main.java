package com.capgemini;

public class Main {

    public static void main(String[] args) {

        //Car myCar = new Car();


	    CarBuilder raceStyleCar = new RaceCarBuilder();

        // The Director can be seen as a car engineer who oversees the construction of the car
	    CarDirector carDirector = new CarDirector(raceStyleCar);

	    carDirector.makeCar();

	    Car firstCar = carDirector.getCar();

        System.out.println("Car built");
        System.out.println("Car body type: " + firstCar.getCarBody());
        System.out.println("Car amount of doors: " + firstCar.getCarDoors());
        System.out.println("Car engine type: " + firstCar.getCarEngine());
        System.out.println("Car color: " + firstCar.getCarColor());
    }
}
