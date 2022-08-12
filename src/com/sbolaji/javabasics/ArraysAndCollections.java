package com.sbolaji.javabasics;

import java.text.MessageFormat;

public class ArraysAndCollections {
    public static void main(String[] args) {
//        Employee[] listOfEmployees = new Employee[3];
        Employee firstEmployee, secondEmployee;
        firstEmployee = new Employee(10, "James", 43);
        secondEmployee = new Employee(12, "Jones", 22);
        Employee[] listOfEmployees = {firstEmployee, secondEmployee};
        try {
            System.out.println("Array length is: " + listOfEmployees.length);
            System.out.println(MessageFormat.format("2nd employee is: {0}", listOfEmployees[2].getEmployeeName()));
        }
        catch (ArrayIndexOutOfBoundsException exceptionMessage) {
            System.out.println(exceptionMessage.getMessage());
        }
    }
}

class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] cars = new String[2][3];
        System.out.println("Length of cars array is: " + cars.length);

        for (int row = 0; row < cars.length; row+=1) {
            System.out.println();
            for (int column = 0; column < cars[row].length; column+=1)
                System.out.print(MessageFormat.format("Car at row[{0}],column[{1}] | ", row, column));
        }
    }
}