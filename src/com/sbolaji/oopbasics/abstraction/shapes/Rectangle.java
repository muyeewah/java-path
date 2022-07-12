package com.sbolaji.oopbasics.abstraction.shapes;

public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(String colour, double length, double breadth) {
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle's color is " + colour + " and area is : " + area();
    }

}
