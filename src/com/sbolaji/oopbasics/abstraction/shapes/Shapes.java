package com.sbolaji.oopbasics.abstraction.shapes;

public class Shapes {
    public static void main(String[] args) {
        Shape circle, rectangle;
        circle = new Circle("Purple", 0.56);
        rectangle = new Rectangle("indigo", 4.0, 6.0);

        System.out.println(rectangle.toString());
    }
}
