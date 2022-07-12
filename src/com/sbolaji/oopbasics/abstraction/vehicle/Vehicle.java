package com.sbolaji.oopbasics.abstraction.vehicle;

public interface Vehicle {

    String startEngine();

    default void speedUp() {
    }

    default String examineVehicle() {
        return "Vehicle is examined";
    }

    static int getHorsePower(int rpm, int torque) {
        return rpm * torque;
    }

}

