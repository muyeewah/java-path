package com.sbolaji.oopbasics.abstraction.shapes;

public abstract class Shape {
    String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    abstract double area();
    public abstract String toString();

}
