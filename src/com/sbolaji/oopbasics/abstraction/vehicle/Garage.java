package com.sbolaji.oopbasics.abstraction.vehicle;

public class Garage {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("camry", 2500, 480);
        System.out.println(toyota.examineVehicle());
        System.out.println(toyota.toString());
    }
}
