package com.sbolaji.oopbasics.abstraction.vehicle;

public class Toyota extends Car {

    private int rpm;
    private int torque;

    public Toyota(String model, int rpm, int torque) {
        super(model);
        this.rpm = rpm;
        this.torque = torque;
    }

    public Toyota(String model) {
        super(model);
    }

    @Override
    public String startEngine() {
        return null;
    }

    @Override
    public String examineVehicle() {
        return "Toyota is being examined...";
    }

    @Override
    public String toString() {
        return "Toyota model is " + model + " with a horse power of " + Vehicle.getHorsePower(rpm, torque);
    }
}
