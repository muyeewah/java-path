package com.sbolaji.oopbasics.abstraction.vehicle;

public abstract class Car implements Vehicle{
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String examineVehicle() {
        return "Car is being examined";
    }
}
