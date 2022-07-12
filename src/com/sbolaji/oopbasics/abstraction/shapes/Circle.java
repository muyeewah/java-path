package com.sbolaji.oopbasics.abstraction.shapes;

public class Circle extends Shape {

    double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle's color is " + colour + " and area is : " + area();
    }

}
